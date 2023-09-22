package introductionOOP;

/**
 * Точка с координатами Х и Y
 */
public class Point {
    protected int x1;
    protected int x2;

    /**
     *
     * @param x точка Х
     * @param x2    точка Y
     */
    public Point(int x, int x2) {
        this.x1 = x;
        this.x2 = x2;
    }
    public Point(int value) {
        this(value, value);
    }
    public Point() {
        this(0);
    }

    public static double dist(Point a, Point b) {
        return Math.sqrt(Math.pow(b.x1- a.x1, 2) + Math.pow(b.x2 - a.x2, 2));
    }

    public String toString(String str) {
        return "Point " + str + " [x1: " + x1 + " x2: " + x2 + " ]";
    }
}
