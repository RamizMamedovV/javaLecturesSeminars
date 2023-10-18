package introductionOOP.Seminars.Sem007.observer;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Google");
        Employee employee1 = new Employee("employee1", Occupations.programmer);
        Employee employee2 = new Employee("employee1", Occupations.driver);

        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        System.out.println(company);
        
        company.fireEmployee(employee2);

        System.out.println(company);
    }
}
