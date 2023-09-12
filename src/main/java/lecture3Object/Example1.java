package lecture3Object;

public class Example1 {
    public static void main(String[] args) {
        Sum(1, 1.2);
        //System.out.println(Sum(1, 1.2)); // для этого переименовать void в Object
        // и завернуть return (Object)((Double) a + (Double) b);
    }

    static void Sum(Object a, Object b) {
        if(a instanceof Double && b instanceof Double) {
            System.out.println((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Double) {
            System.out.println(((Integer) a + (Double) b));
        } else System.out.println(0);
    }
}
