package sem7_homework;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    Applicant applicant;

    List<Applicant> applicantList;

    public JobAgency() {
        applicantList = new ArrayList<>();
    }

    @Override
    public void publish(String name, double salary) {
        System.out.printf("Organization %s published vacancy for %.2f\n", name, salary);
        for (Applicant applicant : applicantList) {
            applicant.lookingFor(name, salary);
        }
    }
}
