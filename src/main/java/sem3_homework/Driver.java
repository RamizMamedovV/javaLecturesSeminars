package sem3_homework;

public class Driver extends Employee{

    private double salary;
    private int drivingExperience;
    private static int DriverId;

    private final int id;

    static {
        DriverId = 200;
    }

    {
        id = ++DriverId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }


    // TODO доработать условие: при владении авто в течении года, добавлять 1 год опыта
    private void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }


    public Driver(String surname, String name, int age, double salary, int drivingExperience) {
        super(surname, name, age);
        this.salary = salary;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Driver [id: %d] surname: %s," +
                " name: %s, age: %d, salary: %.2f, drivingExperience: %d"
                , id, surname, name, age, salary, drivingExperience);
    }
}
