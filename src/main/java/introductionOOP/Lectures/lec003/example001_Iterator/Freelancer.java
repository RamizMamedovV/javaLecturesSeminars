package introductionOOP.Lectures.lec003.example001_Iterator;

import java.util.Iterator;

public class Freelancer extends Worker implements Iterator<String> {

    private String name;
    private int age;


    public Freelancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Freelancer() {}

    int count;
    @Override
    public boolean hasNext() {
        return count++ < 2;
    }

    @Override
    public String next() {
        switch (count) {
            case 1:
                return String.format("name %s", name );
            default:
                return String.format("age %d", age);
        }
    }
}
