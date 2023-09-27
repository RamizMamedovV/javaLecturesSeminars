package introductionOOP.Seminars.Sem002;

public class Track extends Obstacle{

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    int getLength() {
        return this.length;
    }

    @Override
    int getHeight() {
        return 0;
    }
}
