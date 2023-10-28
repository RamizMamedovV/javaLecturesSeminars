package seminarExceptionsHomework;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        String[] fullName = null;
        long phoneNumber = 0;
        String date = null;
        String gender = null;
        String lastName = null;

        try {
            checkLength(user);
            phoneNumber = checkPhoneNumber(user);
            date = checkDate(user);
            gender = checkGender(user);
            fullName = checkString(user);
            lastName = fullName[0];
        } catch (PhoneNumberFormatException e) {
            System.out.println(e.getMessage() + e.getPhoneNumber());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//Magov Mag Magich 11.11.1234 89991234567 m
        try (FileWriter writer = new FileWriter(String.format("%s.txt",lastName),true)) {
            writer.write(String.format("\n<%s>",fullName[0]));
            writer.write(String.format("<%s>",fullName[1]));
            writer.write(String.format("<%s>",fullName[2]));
            writer.write(String.format("<%s>",date));
            writer.write(String.format("<%d>",phoneNumber));
            writer.write(String.format("<%s>",gender));
        } catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }

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
                    String.format("Количество введённого не соответствует, ожидается 6. " +
                            "Вы ввели: %d", str.length)
                    , str.length);
    }
    //endregion

    //region checkPhoneNumber method

    /**
     * Проверка на присутствие данных в цифровом формате
     * @param str массив строк данных
     * @return номер телефона
     * @throws PhoneNumberFormatException Отсутствие формата числа или
     * короткий номер - менее 5 цифр
     */
    public static long checkPhoneNumber(String[] str) throws Exception {
        long phoneNumber = 0;
        boolean hasInteger = false;

        for (String enter : str) {
            if (isInteger(enter)) {
                phoneNumber = Long.parseLong(enter);
                hasInteger = true;
            }
        }
        if (!hasInteger)
            throw new PhoneNumberFormatException
                    ("Отсутствует формат числа для номера телефона", 0);
        else if (phoneNumber <= 9_999) {
            throw new PhoneNumberFormatException(
                    "Номер слишком короткий ", phoneNumber);
        }
        return phoneNumber;
    }

    private static boolean isInteger(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //endregion

    //region checkDate method
    public static String checkDate(String[] str) throws Exception {
        boolean hasDate = false;
        String date = null;
        for (String enter : str) {
            if (isDate(enter)) {
                date = enter;
                hasDate = true;
            }
        }
        if (!hasDate)
            throw new DateFormatException("Не соответствует формату: дд.мм.гггг");
        return date;
    }

    private static boolean isDate(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.parse(s);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    //endregion

    ///region checkGender method
    public static String checkGender(String[] str) throws Exception {
        String gender = null;
        boolean hasGender = false;
        for (String enter : str) {
            if (isChar(enter)) {
                gender = enter;
                hasGender = true;
            }
        }
        if (!hasGender)
            throw new GenderFormatException("Не соответствует формату: пол(символ латиницей f или m)");
        return gender;
    }

    private static boolean isChar(String s) {
        if (s.length() == 1)
            return s.equals("f") || s.equals("m");
        return false;
    }
    //endregion

    public static String[] checkString(String[] str) {
        String[] fio = new String[3];
        int count = 0;
        for (String s : str) {
            if (!isDate(s) && !isChar(s) && !isInteger(s)) {
                fio[count] = s;
                count++;
            }

        }
        return fio;
    }
}
