package example;

public class Eagle extends Animals{
    public static String type;
    static {
        type = "Птицы";
    }
    public Eagle(String type, String breed, int weight) {
        super(type, breed, weight);
    }

    public static String getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("Орлы любят мясо");
        this.weight += 2;
    }

    @Override
    public void wc() {
        this.weight -= 1;
    }

    @Override
    public String toString() {
        return null;
    }
}
