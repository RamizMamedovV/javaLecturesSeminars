package introductionOOP.Lectures.lec003.example001_Iterator;

import java.util.Iterator;

public class Worker  implements Iterator<String>{

    public String firstName;
    public String lastName;
    public int age;
    public int salary;


    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {}

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }


    int count;
    public boolean hasNext() {
        return count++ < 4;
    }

    public String next() {
        return switch (count) {
            case 1 ->
                //return firstName;
                    String.format("firstName: %s", firstName);
            case 2 ->
                //return lastName;
                    String.format("lastName: %s", lastName);
            case 3 ->
                //return age;
                    String.format("age: %d", age);
            default ->
                //return salary;
                    String.format("salary: %d", salary);
        };
    }
}
