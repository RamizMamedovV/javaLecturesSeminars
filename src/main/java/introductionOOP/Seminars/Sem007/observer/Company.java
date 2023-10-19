package introductionOOP.Seminars.Sem007.observer;

import java.util.*;

public class Company implements CompanyResponse{
    //region field

    Map<Integer,Employee> employeeCollection;
    private final Random rnd = new Random();

    private String name;

    private double salary;

    private Occupations occupations;

    private Employee employee;

    private Publisher publisher;

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

    private double setSalary(Occupations occupations) {
        if (occupations == Occupations.cleaner
            || occupations == Occupations.driver
            || occupations  == Occupations.loader) {
            return rnd.nextDouble(50_000, 80_000);
        } else if (occupations  == Occupations.doctor
                    || occupations  == Occupations.programmer) {
            return rnd.nextDouble(80_000, 120_000);
        } else {
            return 0;
        }
    }

    //endregion



    public Company(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
        employeeCollection = new HashMap<>();
    }

    public void hireEmployee(Employee employee, Document vacancy) {
        //setSalary(employee);
        System.out.println("hireEmployee got");
        if (employee != null)
            employeeCollection.put(employee.getId(), employee);
    }

    public void fireEmployee(Employee employee) {
        employeeCollection.remove(employee.getId(), employee);
    }

    public void sendOffer(Occupations occupations) {
        System.out.println("Company sent");
        Vacancy vacancy = new Vacancy(this.name, this.setSalary(occupations), occupations);
        System.out.println(vacancy);        //debug
        System.out.println();
        hireEmployee (publisher.sendOffer(vacancy), vacancy);

    }

    @Override
    public String toString() {
        return "" + employeeCollection;
    }

    @Override
    public void gotResponse(boolean isAcceptable, Employee employee, Document vacancy) {
        if (isAcceptable) hireEmployee(employee, vacancy);
    }

//    class Vacancy {
//        String companyName;
//
//        double offerSalary;
//
//        Occupations occupations;
//
//        public Vacancy(String companyName, double offerSalary, Occupations occupations) {
//            this.companyName = companyName;
//            this.offerSalary = offerSalary;
//            this.occupations = occupations;
//        }
//    }
}
