package sem7_homework;

public class Employee implements Applicant {

    //region Поля
    private String name;
    int salary;
    private Status status = Status.Off;
    private final Profession profession = Profession.programmer;

    //endregion

    //region getters and setters
    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Profession getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }
    //endregion


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     */
    @Override
    public void lookingFor(String name, double salary) {
        if (this.getSalary() >= salary) {
            System.out.println(this.getName() + " I am ready for this job");
        }
        else System.out.println("I am not ready for it");
    }
}
