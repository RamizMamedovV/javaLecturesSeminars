package introductionOOP.Seminars.Sem007.observer;

public class Main {
    public static void main(String[] args) {

        JobAgency publisher = new JobAgency();
        Company company = new Company("Google", publisher);
        Employee employee1 = new Employee("employee1"
                , Occupations.programmer, 120_000, publisher);
        Employee employee2 = new Employee("employee2"
                , Occupations.driver, 50_000, publisher);

        publisher.registerObserver(employee1);
        publisher.registerObserver(employee2);
        company.sendOffer(Occupations.programmer);

        System.out.println(company);
    }
}
