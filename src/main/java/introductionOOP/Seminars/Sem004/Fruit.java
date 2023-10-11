package introductionOOP.Seminars.Sem004;

public abstract class Fruit {

    protected double weight = 0.1;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
