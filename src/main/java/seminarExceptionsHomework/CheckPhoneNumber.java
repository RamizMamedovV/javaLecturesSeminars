package seminarExceptionsHomework;

public class CheckPhoneNumber {
    /**
     * Проверка на присутствие данных в цифровом формате
     * @param str массив строк данных
     * @return номер телефона
     * @throws PhoneNumberFormatException Отсутствие формата числа или
     * короткий номер - менее 5 цифр
     */
    public static long checkPhoneNumber(String[] str) throws PhoneNumberFormatException {
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

    public static boolean isInteger(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
