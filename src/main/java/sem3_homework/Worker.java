package sem3_homework;

public class Worker extends Employee{
    private double salary;
    private static int WorkerId;

    protected int id;

    static {
        WorkerId = 100;
    }

    {
        id = ++WorkerId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String surname, String name, int age, double salary) {
        super(surname, name, age);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
            return String.format("Worker [id: %d] surname: %s," +
                    " name: %s, age: %d, salary: %.2f", id, surname, name, age, salary);
    }
}
