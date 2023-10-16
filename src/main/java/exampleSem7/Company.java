package exampleSem7;

public class Company {

    String name;
    double salary;

    public Company(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Company: %s, salary: %.2f", name, salary);
    }
}
