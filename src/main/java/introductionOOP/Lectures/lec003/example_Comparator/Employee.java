package introductionOOP.Lectures.lec003.example_Comparator;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    List<Employee> employeesList;
    protected String surname;
    protected String name;
    protected int age;
    protected int employeesId;
    private static int EmId;

    static {
        EmId = 0;
    }

    {
        employeesId = ++EmId;
    }

    public Employee(String surname, String name, int age) {
        employeesList = new ArrayList<>();
        this.surname = surname;
        this.name = name;
        this.age = age;
        EmId++;
    }

    @Override
    public String toString() {
        return String.format("Employees[%d]: surname_ %s, name_ %s, age: %d"
                ,employeesId, surname, name, age);
    }
}
