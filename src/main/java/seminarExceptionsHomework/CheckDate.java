package seminarExceptionsHomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckDate {
    /**
     * Проверка на присутствие данных в формате даты дд.мм.гггг
     * @param str массив строк данных
     * @return введённую строку в формате дд.мм.гггг
     * @throws DateFormatException Не соответствует формату: дд.мм.гггг
     */
    public static String checkDate(String[] str) throws DateFormatException {
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

    public static boolean isDate(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.parse(s);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
