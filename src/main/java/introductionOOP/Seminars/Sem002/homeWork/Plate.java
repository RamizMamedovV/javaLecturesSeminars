package introductionOOP.Seminars.Sem002.homeWork;

public class Plate {
    private int food;
    public Plate(int food) {
        setFood(food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
