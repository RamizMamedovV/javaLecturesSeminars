package sem3_homework;


import java.util.Random;

public class CreateEmployees {
    private static final Random random = new Random();
    public static final String[] MenSurnames = {"Иванов", "Петров", "Смирнов", "Сидоров",
            "Кузнецов", "Васильев", "Козлов", "Лебедев", "Морозов"};
            //,"Новиков", "Павлов", "Соколов", "Михайлов", "Федоров", "Жуков"};

    public static final String[] FemaleSurnames = {"Иванова", "Петрова", "Смирнова", "Сидорова",
            "Кузнецова", "Васильева", "Козлова", "Лебедева", "Морозова"};
            //,"Новикова", "Павлова", "Соколова", "Михайлова", "Федорова", "Жукова"};
    public static final String[] menNames = {"Александр", "Максим", "Дмитрий", "Игорь",
            "Андрей", "Сергей", "Владимир", "Евгений", "Алексей", "Глеб"};
    public static final String[] femaleNames = {"Анна", "Екатерина","Ольга","Елена","Мария",
            "Татьяна", "Наталья", "Юлия", "Валентина", "Александра", "Евгения"};
    public static Employee getEmployee() {
        Random rnd = new Random();
        int i = rnd.nextInt(6);
        return switch (i) {
            case 1  -> new Worker(FemaleSurnames[random.nextInt(9)]
                    , femaleNames[random.nextInt(11)]
                    , rnd.nextInt(18, 45)
                    , rnd.nextInt(80, 120) * 1000);

            case 2 -> new Driver(MenSurnames[random.nextInt(9)]
                    , menNames[random.nextInt(10)]
                    , rnd.nextInt(18, 45)
                    , rnd.nextInt(80, 120) * 1000
                    , rnd.nextInt(1, 40));

            case 3 -> new Freelancer(MenSurnames[random.nextInt(9)]
                    , menNames[random.nextInt(10)]
                    , rnd.nextInt(18, 45)
                    , rnd.nextInt(3, 10) * 100);

            case 4 -> new Freelancer(FemaleSurnames[random.nextInt(9)]
                    , femaleNames[random.nextInt(11)]
                    , rnd.nextInt(18, 45)
                    , rnd.nextInt(15, 25) * 100);

            default ->new Worker(MenSurnames[random.nextInt(9)]
                    , menNames[random.nextInt(10)]
                    , rnd.nextInt(18, 45)
                    , rnd.nextInt(80, 120) * 1000);
        };

    }

    public static Employee[] getEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = getEmployee();
        }
        return employees;
    }

}
