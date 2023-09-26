package OOP_Seminar_1;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        BottleOfMilk milk1 = new BottleOfMilk("ooo Бел", "Молоко", 90
                , 1.5,5, 15);
        BottleOfMilk milk2 = new BottleOfMilk("ooo Б", "Молоко", 50
                , 0.5,5, 15);
        BottleOfMilk milk3 = new BottleOfMilk("ooo Б", "Молоко", 70
                , 1.0,5, 15);
        BottleOfWater water1 = new BottleOfWater("ooo Бел", "Вода1"
                                , 50.00, 1);
        BottleOfWater water2 = new BottleOfWater("ooo Бел", "Вода1"
                                , 50.00, 1);
        Chocolate choco1 = new Chocolate("ooo Choco", "Chocolate"
                                , 250.00, 60);

        ArrayList<Product> products = new ArrayList<>();
        products.add(milk1);
        products.add(milk2);
        products.add(milk3);
        products.add(milk1);
        products.add(milk2);
        products.add(water2);
        products.add(water2);
        products.add(water1);
        products.add(choco1);

        VendingMachine vendingMachine = new VendingMachine(products);
        System.out.println(vendingMachine.getBottleOfMilk("ooo Бел", 1.5));
        System.out.println(vendingMachine.getChocolate("ooo Choco", 60));


    }
}
