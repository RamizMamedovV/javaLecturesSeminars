package introductionOOP.Seminars.Sem002;

public class Wall extends Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    int getLength() {
        return 0;
    }

    @Override
    int getHeight() {
        return this.height;
    }
}
