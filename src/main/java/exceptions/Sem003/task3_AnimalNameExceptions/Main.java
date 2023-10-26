package exceptions.Sem003.task3_AnimalNameExceptions;

import java.util.Random;

public class Main {

    public static Random rnd = new Random();
    public static void main(String[] args) {

        String[] names = {"aaaa", "aa", null, "azxs"};
        String[] dogNames = {"daaa", "da", null, "dzxs"};
        for (int i = 0; i < 5; i++) {

            try {
                int dis = rnd.nextInt(50, 110);
                Cat cat = Cat.init(names[i]);
                Dog dog = Dog.init(dogNames[i]);
                dog.swim(dis);
                cat.swim(dis);
            } catch (AnimalNameException | NullPointerException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------------");
        }
    }
}
