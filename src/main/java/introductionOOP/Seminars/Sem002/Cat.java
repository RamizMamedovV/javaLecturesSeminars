package introductionOOP.Seminars.Sem002;

public class Cat extends BaseCat implements Runner {

    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean jump(int height) {
        if (getMaxJump() >= height) {
            System.out.printf("%s прыгнул на высоту %d +\n", name, height);
            return true;
        } else {
            System.out.printf("%s не смог прыгнуть на высоту %d \n", name, height);
            System.out.println("--------------");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (getMaxRun() >= length) {
            System.out.printf("%s пробежал расстояние %d \n", name, length);
            return true;
        } else {
            System.out.printf("%s не смог пробежать расстояние %d \n", name, length);
            System.out.println("--------------");
            return false;
        }
    }
}
