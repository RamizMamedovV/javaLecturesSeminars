package introductionOOP.Seminars.Sem007.observer;

public class Employee {

    //region field
    private static int staticEmployeeId;

    private int id;
    private String name;


    private Occupations occupations;
    //endregion

    //region getters setters

    public String getName() {
        return name;
    }

    public Occupations getOccupations() {
        return occupations;
    }

    public int getId() {
        return id;
    }

    //endregion

    static {
        staticEmployeeId = 1000;
    }

    {
        id = ++staticEmployeeId;
    }
    public Employee(String name, Occupations occupations) {
        this.name = name;
        this.occupations = occupations;
    }

    @Override
    public String toString() {
        return String.format(" name: %s, occupation: %s\n "
                ,  name, occupations);
    }
}
