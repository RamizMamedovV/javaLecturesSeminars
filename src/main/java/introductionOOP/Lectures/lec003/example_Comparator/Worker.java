package introductionOOP.Lectures.lec003.example_Comparator;


public class Worker extends Employees{
    private int salary;
    public int id;
    public Worker(String surname, String name, int age, int salary) {
        super(surname, name, age);
        this.salary = salary;
        setId();
    }

    private void setId() { id++; }

    @Override
    public String toString() {
        return String.format("Employees[%d]: surname_ %s, name_ %s, age: %d, salary: %d"
                ,id++, surname, name, age, salary);
    }
}
