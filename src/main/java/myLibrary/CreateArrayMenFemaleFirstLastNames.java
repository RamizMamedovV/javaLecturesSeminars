package myLibrary;

import java.util.Random;

public class CreateArrayMenFemaleFirstLastNames {

    private static final Random random = new Random();
    public static String[] getMenSurnames(int count) {
        String[] names = new String[] {"Иванов", "Петров", "Смирнов", "Сидоров",
                "Кузнецов", "Васильев", "Козлов", "Лебедев", "Морозов",
                "Новиков", "Павлов", "Соколов", "Михайлов", "Федоров", "Жуков"};
        //Random random = new Random();
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = names[random.nextInt(15)];
        }
        return res;
    }

    public static String[] getFemaleSurnames(int count) {
        String[] names = new String[] {"Иванова", "Петрова", "Смирнова", "Сидорова",
                "Кузнецова", "Васильева", "Козлова", "Лебедева", "Морозова",
                "Новикова", "Павлова", "Соколова", "Михайлова", "Федорова", "Жукова"};
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = names[random.nextInt(15)];
        }
        return res;
    }

    public static String[] getMenNames(int count) {
        String[] namesM = new String[] {"Александр", "Максим", "Дмитрий", "Игорь",
                "Андрей", "Сергей", "Владимир", "Евгений", "Алексей", "Глеб"};
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = namesM[random.nextInt(10)];
        }
        return res;
    }

    public static String[] getFemaleNames(int count) {
        String[] namesF = new String[] {"Анна", "Екатерина","Ольга","Елена","Мария",
                "Татьяна", "Наталья", "Юлия", "Валентина", "Александра", "Евгения"};
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = namesF[random.nextInt(11)];
        }
        return res;
    }

    public static String[] getFemaleFirstLastNames(int count) {
        String[] names = getFemaleNames(count);
        String[] surnames = getFemaleSurnames(count);
        StringBuilder sb;
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            sb = new StringBuilder();
            res[i]  = String.valueOf(sb.append(names[i]).append(" ").append(surnames[i]));
        }
        return res;
    }

    public static String[] getMenFirstLastNames(int count) {
        String[] names = getMenNames(count);
        String[] surnames = getMenSurnames(count);
        StringBuilder sb;
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            sb = new StringBuilder();
            res[i]  = String.valueOf(sb.append(names[i]).append(" ").append(surnames[i]));
        }
        return res;
    }
}
