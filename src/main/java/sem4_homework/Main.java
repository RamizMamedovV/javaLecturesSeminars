package sem4_homework;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> my = new MyHashMap<>(3);
        String res = my.put(12, "rr");
        my.put(1, "qq");
        my.put(5, "dd");
        my.put(2, "ww");
        my.put(3, "ree");
        my.put(3, "aa");
        my.put(4, "ss");
        my.put(5, "ddgg");
        my.put(6, "dd");
        my.put(7, "dd");
        my.put(8, "dd");

        System.out.println(my.remove(3));
        System.out.println(my.get(3));

        my.print();
    }
}
