package sem7_homework;

public class Company implements Employer {
    String name;

    double salary;
    Publisher jobAgency;
    Status status = Status.Off;

    public Company(String name, double salary, Publisher jobAgency) {
        this.name = name;
        this.salary = salary;
        this.jobAgency = jobAgency;
    }

    @Override
    public void sendPublish() {
        jobAgency.publish(name, salary);
    }
}
