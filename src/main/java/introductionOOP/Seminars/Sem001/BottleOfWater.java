package introductionOOP.Seminars.Sem001;

public class BottleOfWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String name, String brand, double price, int volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("[Вода] %s - %s -price: %.2f -volume: %d"
                , name, brand, price, volume);
    }
}
