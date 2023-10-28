package seminarExceptionsHomework;

public class CheckGender {
    /**
     * Проверка на присутствие данных гендерного обозначения в формате символа латиницей f или m
     * @param str массив строк данных
     * @return пол f или m
     * @throws GenderFormatException Не соответствует формату: пол(символ латиницей f или m)
     */
    public static String checkGender(String[] str) throws GenderFormatException {
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

    public static boolean isChar(String s) {
        if (s.length() == 1)
            return s.equals("f") || s.equals("m");
        return false;
    }
}
