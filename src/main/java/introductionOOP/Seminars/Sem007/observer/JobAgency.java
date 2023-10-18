package introductionOOP.Seminars.Sem007.observer;

import sem7_homework.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    List<Employee> observes;

    public JobAgency() {
        observes = new ArrayList<>();
    }

    public void registerObserver(Employee employee){
        observes.add(employee);
    }

    public void removeObserver(Employee employee){
        observes.remove(employee);
    }

    public void sendOffer(Company.Vacancy vacancy) {
        System.out.println("JobAgency got");
        for (Employee employee : observes) {
            employee.getOffer(vacancy);
        }
    }

}
