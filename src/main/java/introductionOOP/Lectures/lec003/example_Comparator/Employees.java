package introductionOOP.Lectures.lec003.example_Comparator;

import java.util.ArrayList;
import java.util.List;

public abstract class Employees {

    List<Employees> employeesList;
    protected String surname;
    protected String name;
    protected int age;
    protected int id = 1;
    private static int countId;

    static {
        countId++;
    }

    {
        System.out.println(id++);
        id = countId;
    }

    public Employees(String surname, String name, int age) {
        employeesList = new ArrayList<>();
        this.surname = surname;
        this.name = name;
        this.age = age;
        setId();
    }

    private void setId() {id++; }


}
