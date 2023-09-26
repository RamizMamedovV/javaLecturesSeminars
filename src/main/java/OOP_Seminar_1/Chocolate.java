package OOP_Seminar_1;

public class Chocolate extends Product {
    int cocoa;

    public int getCocoa() {
        return cocoa;
    }

    public Chocolate(String name, String brand, double price, int cocoa) {
        super(name, brand, price);
        this.cocoa = cocoa;
    }

    @Override
    public String toString() {
        return String.format("[Шоколад] %s - %s - price: %.2f - cocoa: %d"
                , name, brand, price, cocoa);
    }
}
