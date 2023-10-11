package introductionOOP.Seminars.Sem004;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruits(new Apple());
        appleBox.addFruits(new Apple());
        appleBox.addFruits(new Apple());
        appleBox2.addFruits(new Apple(), 15);
        orangeBox.addFruits(new Orange(), 10);

        System.out.println("appleBox weight = " + appleBox.getWeight());
        System.out.println("appleBox2 weight = " + appleBox2.getWeight());
        System.out.println("orangeBox weight = " + orangeBox.getWeight());
        System.out.println(appleBox.compare(appleBox2));
        System.out.println(appleBox2.compare(orangeBox));

        appleBox2.sprinkleFruitsTo(appleBox);
        System.out.println("appleBox weight = " + appleBox.getWeight());
        System.out.println("appleBox2 weight = " + appleBox2.getWeight());
    }
}
