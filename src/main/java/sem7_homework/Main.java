package sem7_homework;

public class Main {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company company = new Company("OOO", 30_000, jobAgency);
        Employee employee = new Employee("MMM", 35_000);
        jobAgency.applicantList.add(employee);

        company.sendPublish();
    }
}
