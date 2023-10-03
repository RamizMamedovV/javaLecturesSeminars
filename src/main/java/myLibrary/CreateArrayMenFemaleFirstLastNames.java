package myLibrary;

import java.util.Random;

public class CreateArrayMenFemaleFirstLastNames {

    private static final Random random = new Random();
    public static final String[] MenSurnames = {"Иванов", "Петров", "Смирнов", "Сидоров",
            "Кузнецов", "Васильев", "Козлов", "Лебедев", "Морозов",
            "Новиков", "Павлов", "Соколов", "Михайлов", "Федоров", "Жуков"};

    public static final String[] FemaleSurnames = {"Иванова", "Петрова", "Смирнова", "Сидорова",
            "Кузнецова", "Васильева", "Козлова", "Лебедева", "Морозова",
            "Новикова", "Павлова", "Соколова", "Михайлова", "Федорова", "Жукова"};
    public static final String[] menNames = {"Александр", "Максим", "Дмитрий", "Игорь",
            "Андрей", "Сергей", "Владимир", "Евгений", "Алексей", "Глеб"};
    public static final String[] femaleNames = {"Анна", "Екатерина","Ольга","Елена","Мария",
            "Татьяна", "Наталья", "Юлия", "Валентина", "Александра", "Евгения"};

    // region method getMenSurnames
    public static String[] getMenSurnames(int count) {
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = MenSurnames[random.nextInt(15)];
        }
        return res;
    }

    // end region getMenSurnames

    public static String[] getFemaleSurnames(int count) {
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = FemaleSurnames[random.nextInt(15)];
        }
        return res;
    }

    public static String[] getMenNames(int count) {
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = menNames[random.nextInt(10)];
        }
        return res;
    }

    public static String[] getFemaleNames(int count) {
        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = femaleNames[random.nextInt(11)];
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
