package introductionOOP.Lectures.lec003.example_Comparator;


public class Worker extends Employee {
    protected int salary;
    private static int WId;
    private final int id;

    static {
        WId = 0;
    }

    {
        id = ++WId;
    }
    public Worker(String surname, String name, int age, int salary) {
        super(surname, name, age);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("Worker[%d]: surname_ %s, name_ %s, age: %d, salary: %d"
                ,id, surname, name, age, salary);
    }
}
