package sem7_homework;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacancyType){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(name, salary, vacancyType);
        jobAgency.sendOffer(vacancy);
    }
}
