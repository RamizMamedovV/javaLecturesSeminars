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
                номер телефона(формата 89991234567)
                пол(символ латиницей f или m)
                Ввод:\s""";
        String[] user = userInput(str);
        String[] fio = null;
        long phoneNumber = 0;
        String date = null;
        String gender = null;
        String lastName = null;

        try {
            checkLength(user);
            phoneNumber = checkPhoneNumber(user);
            date = checkDate(user);
            gender = checkGender(user);
            fio = checkString(user);
            lastName = fio[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//Magov Mag Magich 11.11.1234 89991234567 m
        try (FileWriter writer = new FileWriter(lastName)) {
            writer.write(String.format("<%s>",fio[0]));
            writer.write(String.format("<%s>",fio[1]));
            writer.write(String.format("<%s>",fio[2]));
            writer.write(String.format("<%s>",date));
            writer.write(String.format("<%d>",phoneNumber));
            writer.write(String.format("<%s>",gender));
        } catch (NullPointerException | IOException e) {
            System.out.println("nnnn");
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
     * @throws RuntimeException ArrayNullPointerException и ArrayLengthException
     */
    public static void checkLength(String[] str) throws RuntimeException {
        if (str == null)
            throw new ArrayNullPointerException("отсутствие данных");
        else if (str.length != 6)
            throw new ArrayLengthException(
                    String.format("Количество введённого не соответствует = 6. " +
                            "Вы ввели: %d", str.length)
                    , str.length);
    }
    //endregion

    //region checkPhoneNumber method
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
            throw new Exception("do not have correct number");
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
            throw new Exception("Do not has date");
        return date;
    }

    private static boolean isDate(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");
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
            throw new Exception("not gender");
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
