package example;

public class Lion extends Animals{
    public static String type;
    static {
        type = "Кошачие";
    }

    public Lion(String name, String breed) {
        super(name, breed);
        int weight = 2;
    }

    public static String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("Кошки любят есть мясо");
        weight += 2;
    }

    @Override
    public void wc() {
        weight -= 1;
    }

    @Override
    public String toString() {
        return null;
    }
}
