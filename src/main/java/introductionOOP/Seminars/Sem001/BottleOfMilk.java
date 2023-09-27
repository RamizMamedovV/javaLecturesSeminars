package introductionOOP.Seminars.Sem001;

public class BottleOfMilk extends Product {
    private double volume;
    private int fat;

    public BottleOfMilk(String name, String brand, double price, double volume, int fat, int i) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("[Milk] %s - %s -price: %.2f -volume %.2f -fat %d"
        ,name, brand, price, volume, fat);
    }
}
