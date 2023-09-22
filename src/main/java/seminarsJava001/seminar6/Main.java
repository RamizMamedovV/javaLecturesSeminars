package seminarsJava001.seminar6;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", LocalDate.of(2020, 1,1));
        Cat cat2 = new Cat("Pushok", LocalDate.of(2020, 1,2));
        Cat cat3 = new Cat("Iriska", LocalDate.of(2020, 1,3));
        Cat cat4 = new Cat("Iriska", LocalDate.of(2020, 1,4));

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        List<Cat> catsList = new ArrayList<>();
        catsList.add(cat3);
        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat4);
        System.out.println(catsList);
        Collections.sort(catsList);
        //System.out.println(cats);
        System.out.println(catsList);
    }
}
