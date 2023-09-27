package OOP_Seminar_2_Homework;

public class Main {
    public static void main(String[] args) {

        Cat catFull = new Cat("catFull", 15);
        Cat[] cats = {
                catFull, catFull,
                new Cat("cat1", 15),
                new Cat("cat2", 25),
                catFull,
                new Cat("cat3", 35),
        };
        Plate plate = new Plate(74);

        for (Cat cat : cats) {
            plate.info();
            if (cat.eat(plate.getFood())) {
                int leftFood = plate.getFood() - cat.getAppetite();
                plate.setFood(leftFood);
            } else {
                System.out.println("Убедитесь, что достаточно корма");
                System.out.println("или сводите погулять" +
                        ", в туалет [example: void goToilet()]");
                cat.goToilet();
                System.out.printf("%s сходил в туалет\n",cat.getName());
            }
        }
    }
}
