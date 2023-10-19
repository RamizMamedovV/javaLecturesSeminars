package introductionOOP.Seminars.Sem007.observer.sem7_homework_observerV2;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;

    private Document vacancy;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Document vacancy){
        //int salary = random.nextInt(maxSalary);
//        vacancy.setCompanyName(name);
//        vacancy.setSalary(random.nextInt(maxSalary));
//        vacancy.setVacancyType(vacancyType);
        //Vacancy vacancy = new Vacancy(name, salary, vacancyType);
        jobAgency.sendOffer(vacancy);
    }
}
