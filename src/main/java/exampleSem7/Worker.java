package exampleSem7;

public class Worker implements Applicant{

    Applicant applicant = new JobAgency();

    String name;
    String profession;

    double salary;

    public Worker(String name, String profession, double salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Worker: %s, profession: %s, salary: %.2f"
                , name, profession, salary);
    }

    /**
     *
     */
    @Override
    public void respondApplicant() {

    }

    /**
     * @param salary
     * @return
     */
    @Override
    public int getOffer(double salary) {
        return 0;
    }
}
