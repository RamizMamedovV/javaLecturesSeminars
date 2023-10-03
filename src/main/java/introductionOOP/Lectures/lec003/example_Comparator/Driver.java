package introductionOOP.Lectures.lec003.example_Comparator;

public class Driver extends Worker{

    int drivingExperience;
    private static int DriverId;
    private final int id;

    static {
        DriverId = 0;
    }

    {
        id = ++DriverId;
    }

    public Driver(String surname, String name, int age
            , int salary, int drivingExperience) {
        super(surname, name, age, salary);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Driver[%d]: surname_ %s, name_ %s, age: %d, salary: %d, drivingExperience: %d"
                ,id, surname, name, age, salary, drivingExperience);
    }
}
