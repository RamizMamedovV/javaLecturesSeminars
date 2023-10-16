package exampleSem7;

public class Worker {

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
}
