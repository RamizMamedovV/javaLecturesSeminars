package seminar2;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("hh");
        String str1 = "c1";
        String str2 = "c2";
        int n = 4;
        String str;
        System.out.println(str1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(str1);
            } else {
                sb.append(str2);
            }
        }
        System.out.println(sb);
    }
}
