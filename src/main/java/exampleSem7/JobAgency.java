package exampleSem7;

import java.util.Collection;

public class JobAgency implements Publisher, Applicant{

    Collection<Publisher> publishers;
    Collection<Applicant> applicants;
    @Override
    public void publish() {
        for (Applicant applicant : applicants) {
            //applicant.getOffer()
        }
        System.out.println("publish companies");
    }

    @Override
    public void respondApplicant() {
        System.out.println("respondApplicant");
    }

    @Override
    public int getOffer(double salary) {
        return 0;
    }
}
