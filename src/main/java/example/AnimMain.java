package example;

public class AnimMain {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Cats", "Lion");
        Animals lion2 = new Lion("Cats", "Lion");
        Animals eagle1 = new Eagle("Birds", "Eagle", 50);
        Eagle eagle2 = new Eagle("Birds", "Eagle", 60);

        System.out.println(Lion.getType());
        lion1.eat();
        eagle2.eat();
        lion2.eat();
        lion2.eat();
        lion2.eat();
        lion2.wc();
        lion1.eat();
        lion1.eat();
        lion1.eat();
        lion1.eat();
        lion1.eat();
        System.out.println(lion1.getAge());
//        System.out.println(lion1.weight);
//        lion1.wc();
//        System.out.println(lion2.weight);
//        System.out.println(lion1.weight);
    }
}
