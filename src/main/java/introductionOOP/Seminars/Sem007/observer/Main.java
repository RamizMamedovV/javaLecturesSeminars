package introductionOOP.Seminars.Sem007.observer;

public class Main {
    public static void main(String[] args) {

        JobAgency publisher = new JobAgency();
        Company company = new Company("Google", publisher);
        Employee employee1 = new Employee("employee1", Occupations.programmer);
        Employee employee2 = new Employee("employee2", Occupations.driver);

        publisher.registerObserver(employee1);
        publisher.registerObserver(employee2);
        company.sendOffer(Occupations.programmer);
//        company.hireEmployee(employee1);
//        company.hireEmployee(employee2);
//        System.out.println(company);
//
//        company.fireEmployee(employee2);
//
//        System.out.println(company);
    }
}
