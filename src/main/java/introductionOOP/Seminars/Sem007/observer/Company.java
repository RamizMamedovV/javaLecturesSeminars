package introductionOOP.Seminars.Sem007.observer;

import java.util.*;

public class Company {
    //region field

    Map<Integer,Employee> employeeCollection;
    private Random rnd = new Random();


    private String name;

    private double salary;

    private Occupations occupations;

    private Employee employee;

    //endregion

    //region getter setter

    public String getName() {
        return name;
    }

    public double getSalary(Employee employee) {
        this.employee = employee;
        return 0;
    }

    private void setSalary(Employee employee) {
        this.employee = employee;
        if (employee.getOccupations() == Occupations.cleaner
            || employee.getOccupations()  == Occupations.driver
            || employee.getOccupations()  == Occupations.loader) {
            salary = rnd.nextDouble(50_000, 80_000);
        } else if (employee.getOccupations()  == Occupations.doctor
                    || employee.getOccupations()  == Occupations.programmer) {
            salary = rnd.nextDouble(80_000, 120_000);
        } else {
            salary = 0;
        }
    }

    //endregion
    public Company(String name) {
        this.name = name;
        employeeCollection = new HashMap<>();
    }

    public void hireEmployee(Employee employee) {
        setSalary(this.employee = employee);
        employeeCollection.put(this.employee.getId(), this.employee);
    }

    public void fireEmployee(Employee employee) {
        employeeCollection.remove(this.employee.getId(), this.employee);
    }

    @Override
    public String toString() {
        return "" + employeeCollection;
    }
}
