package introductionOOP.Lectures.lec003.example_Comparator;


public class Freelancer extends Employees{
    private int perHour;

    public Freelancer(String surname, String name, int age, int perHour) {
        super(surname, name, age);
        this.perHour = perHour;
    }

    @Override
    public String toString() {
        return String.format("Employees[%d]: surname_ %s, name_ %s, age: %d, per hour: %d"
                ,id, surname, name, age, perHour);
    }
}
