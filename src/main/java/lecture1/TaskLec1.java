package lecture1;

import java.util.Random;
import java.util.Scanner;
/*Задана натуральная степень k. Сформировать случайным
образом список коэффициентов (значения от 0 до 100)
многочлена многочлен степени k.
*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
*/
public class TaskLec1 {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите степень для многочлена 2 kb 3: ");
        int k = sc.nextInt();

        String[][] exercises2 = new String[1][3];
        exercises2[0][0] = "0 * x^2 + 0 * x + 0 =0";
        exercises2[0][1] = "0 * x^2 + 0 =0";
        exercises2[0][2] = "0 * x^2 =0";

        String[][] exercises3 = new String[1][4];
        exercises3[0][0] = "0 * x^3 + 0 * x^2 + 0 *x + 0 =0";
        exercises3[0][1] = "0 * x^3 + 0 * x^2 + 0 =0";
        exercises3[0][2] = "0 * x^3 + 0 =0";
        exercises3[0][3] = "0 * x^3 + 0 =0";


        if (k == 2) {
            int rnd = rn.nextInt(k);
            System.out.println(rnd);
            String[] elements = exercises2[0][rnd].split(" ");
            for (String e : elements) {
                if (e.equals("0")){
                    System.out.print(rn.nextInt(2,101));
                } else {
                    System.out.print(e);
                }
            }
        } else {
            int rnd = rn.nextInt(k);
            System.out.println(rnd);
            String[] elements = exercises3[0][rnd].split(" ");
            for (String e : elements) {
                if (e.equals("0")){
                    System.out.print(rn.nextInt(2,101));
                } else {
                    System.out.print(e);
                }
            }
        }

    }
}