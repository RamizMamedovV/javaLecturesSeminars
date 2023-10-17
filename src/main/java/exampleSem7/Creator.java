package exampleSem7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Creator {

    Collection<Company> companies = new ArrayList<>();
    Collection<Worker> workers = new ArrayList<>();
    Random rnd = new Random();


    public void createCompany(int count) {
        for (int i = 0; i < count; i++) {
            int num = rnd.nextInt(EnumCompany.values().length);
            companies.add(new Company(EnumCompany.values()[num].toString()
                    , rnd.nextDouble(80_000, 100_000)));
        }
        System.out.println();
        for (Company com : companies) {
            com.publisher.publish();
        }
    }


    public void createWorker(int count) {
        for (int i = 0; i < count; i++) {
            int num = rnd.nextInt(EnumWorker.values().length);
            workers.add(new Worker(String.format("name %d", i)
                    ,EnumWorker.values()[num].toString()
                    , rnd.nextDouble(80_000, 100_000)));
        }

        System.out.println();
        for (Worker com : workers) {
            com.applicant.respondApplicant();
        }
    }

    public void printCompanies(){
        for (Company com : companies) {
            System.out.println(com);
        }
    }

    public void printWorkers(){
        for (Worker com : workers) {
            System.out.println(com);
        }
    }

}
