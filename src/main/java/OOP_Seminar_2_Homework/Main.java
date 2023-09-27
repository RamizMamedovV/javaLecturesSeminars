package OOP_Seminar_2_Homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);
        plate.info();
        int eaten = cat.eat(cat.eat(plate.getFood()));
        plate.setFood(eaten);
        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
