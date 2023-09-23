package introductionOOP;

public class HeroMain {
    public static void main(String[] args) {
        Magician per1 = new Magician();
        Magician per2 = new Magician();
        System.out.println(per1.getInfo());
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per2.healed(50);
        per1.attack(per2);
        System.out.println(per2.getInfo());
        per1.attack(per2);
    }
}
