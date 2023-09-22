package introductionOOP;

public class PointMethod {


    public static void main(String[] args) {
        Point a = new Point(1, 1);
        System.out.println(a.toString("A"));
        Point b = new Point(5, 4);
        System.out.println(b.toString("B"));
        var res = Point.dist(a, b);
        System.out.printf("distance = " + res);
    }
}
