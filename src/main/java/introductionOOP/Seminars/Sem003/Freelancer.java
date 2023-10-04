package introductionOOP.Seminars.Sem003;

import introductionOOP.Seminars.Sem003.Employee;

public class Freelancer extends Employee {
    private double perHour;
    private static int FreeId;

    private final int id;

    static {
        FreeId = 300;
    }

    {
        id = ++FreeId;
    }

    public double getPerHour() {
        return perHour;
    }

    public void setPerHour(double perHour) {
        this.perHour = perHour;
    }

    @Override
    public int getId() {
        return id;
    }

    public Freelancer(String surname, String name, int age, double perHour) {
        super(surname, name, age);
        this.perHour = perHour;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * perHour;
    }

    @Override
    public String toString() {
        return String.format("Freelancer [id: %d] surname: %s," +
                " name: %s, age: %d, perHour: %.2f"
                , id, surname, name, age, perHour);
    }
}
