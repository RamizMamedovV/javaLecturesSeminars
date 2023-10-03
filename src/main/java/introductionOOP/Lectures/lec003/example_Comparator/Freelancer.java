package introductionOOP.Lectures.lec003.example_Comparator;


public class Freelancer extends Employee {
    private final int perHour;

    private static int FLId;
    private final int id;

    static {
        FLId = 0;
    }

    {
        id = ++FLId;
    }

    public Freelancer(String surname, String name, int age, int perHour) {
        super(surname, name, age);
        this.perHour = perHour;
    }

    @Override
    public String toString() {
        return String.format("Freelancer[%d]: surname_ %s, name_ %s, age: %d, per hour: %d"
                ,id, surname, name, age, perHour);
    }
}
