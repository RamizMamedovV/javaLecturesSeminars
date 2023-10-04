package introductionOOP.Seminars.Sem003;

public abstract class Employee implements Comparable<Employee> {
    protected String surname;
    protected String name;
    protected int age;
    private static int EmployeeId;

    protected int id;

    static {
        EmployeeId = 0;
    }

    {
        id = ++EmployeeId;
    }

    public int getId() {
        return id;
    }

    public Employee(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Employee [id: %d], surname: %s," +
                " name: %s, age: %d", id, surname, name, age);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0) {
            return name.compareTo(o.name);
        } else
            return res;
    }
}
