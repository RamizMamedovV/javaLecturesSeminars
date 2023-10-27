package seminarExceptionsHomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        String str = "Введите в одну строку в соответствии форматам:\n" +
                " Фамилия Имя Отчество(разделённые пробелами строки),\n" +
                " дата рождения(формата дд.мм.гггг)\n" +
                " номер телефона(формата 89991234567)\n" +
                " пол(символ латиницей f или m)\nВвод: ";
        String[] user = userInput(str);
        System.out.print("Вы ввели:\n");
        for (String s : user) {
            System.out.println(s);
        }
        try {
            checkLength(user);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPhoneNumber(user);
            checkDate(user);
            checkGender(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] fio = checkString(user);
        for (String s : fio) {
            System.out.print(" " + s);
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
    //endregion me me

    //region checkPhoneNumber method
    public static void checkPhoneNumber(String[] str) throws Exception {
        boolean hasInteger = false;

        for (String enter : str) {
            if (isInteger(enter)) {
                hasInteger = true;
            }
        }
        if (!hasInteger)
            throw new Exception("do not have number");
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return s.length() == 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //endregion

    //region checkDate method
    public static void checkDate(String[] str) throws Exception {
        boolean hasDate = false;
            for (String enter : str) {
                if (isDate(enter)) {
                    hasDate = true;
                }
            }
        if (!hasDate)
            throw new Exception("Do not has date");
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
    public static void checkGender(String[] str) throws Exception {
        boolean hasString = false;
        boolean hasGender = false;
        String[] fullName = new String[3];
        for (String enter : str) {
            if (isChar(enter)) {
                hasGender = true;
            }
        }
        if (!hasGender)
            throw new Exception("not gender");
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
