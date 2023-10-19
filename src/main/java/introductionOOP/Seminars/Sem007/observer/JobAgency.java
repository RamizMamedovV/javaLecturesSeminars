package introductionOOP.Seminars.Sem007.observer;

import sem7_homework.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    List<Employee> observes;

    CompanyResponse companyResponse;

    public JobAgency() {
        observes = new ArrayList<>();
    }

    public void registerObserver(Employee employee){
        observes.add(employee);
    }

    public void removeObserver(Employee employee){
        observes.remove(employee);
    }

    public Employee sendOffer(Document vacancy) {
        System.out.println("JobAgency got");
        for (Employee employee : observes) {
            System.out.println(employee);   //debug
            System.out.println();
            return employee.getOffer(vacancy);
        }
        return null;
    }

    @Override
    public void getResponse(boolean isAcceptable, Employee employee, Document vacancy) {
        if (isAcceptable) {
            System.out.println("getResponse got");  //debug
            observes.remove(employee);
            companyResponse.gotResponse(true, employee, vacancy);
        }
    }

}
