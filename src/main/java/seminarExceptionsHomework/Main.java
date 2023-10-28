package seminarExceptionsHomework;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        String str = """
                Введите в одну строку в соответствии форматам:
                Фамилия Имя Отчество(разделённые пробелами строки),
                дата рождения(формата дд.мм.гггг)
                номер телефона(числовой формат типа 89991234567)
                пол(символ латиницей f или m)
                Ввод:\s""";
        String[] user = userInput(str);
        String[] fullName;
        long phoneNumber = 0;
        String date = null;
        String gender = null;
        String lastName = null;
        String firstName = null;
        String surName = null;

        try {
            checkLength(user);
            phoneNumber = CheckPhoneNumber.checkPhoneNumber(user);
            date = CheckDate.checkDate(user);
            gender = CheckGender.checkGender(user);
            fullName = checkString(user);
            lastName = fullName[0];
            firstName = fullName[1];
            surName = fullName[2];
        } catch (PhoneNumberFormatException e) {
            System.out.println(e.getMessage() + e.getPhoneNumber());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//Magov Mag Magich 11.11.1234 89991234567 m
        try (FileWriter writer = new FileWriter(String.format("%s.txt",lastName),true)) {
            writer.write(String.format("\n<%s>",lastName));
            writer.write(String.format("<%s>",firstName));
            writer.write(String.format("<%s>",surName));
            writer.write(String.format("<%s>",date));
            writer.write(String.format("<%d>",phoneNumber));
            writer.write(String.format("<%s>",gender));
        } catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }
        if(lastName != null)
            System.out.printf("Данные сохранены успешно в файле под именем %s.txt", lastName);
        else System.out.println("Данные не сохранены");
    }

    //region userInput method

    /**
     * Ввод пользователя
     *
     * @param str требуемый запрос
     * @return массив введённых слов разделённые одним пробелом
     */
    public static String[] userInput(String str) {
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }
    //endregion

    //region checkLength method

    /**
     * Проверка на null и соответствие длинны массива
     *
     * @param str массив строк
     * @throws RuntimeException LackDataException и AmountInfoException
     */
    public static void checkLength(String[] str) throws RuntimeException {
        if (str == null)
            throw new LackDataException("отсутствие данных");
        else if (str.length != 6)
            throw new AmountInfoException(
                    String.format("Количество введённых данных не соответствует, ожидается 6. " +
                            "Вы ввели: %d", str.length)
                    , str.length);
    }
    //endregion



    public static String[] checkString(String[] str) {
        String[] fullName = new String[3];
        int count = 0;
        for (String s : str) {
            if (!CheckDate.isDate(s) && !CheckGender.isChar(s) && !CheckPhoneNumber.isInteger(s)) {
                fullName[count] = s;
                count++;
            }

        }
        return fullName;
    }
}
