package seminarsJava001.seminar6.seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*                  Task 0
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
*/

/*                  Task 1
Реализовать консольное приложение, которое: Принимает от пользователя
строку вида text:num
Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
Если введено print:num, выводит строку из позиции num в связном списке
и удаляет её из списка.
 */
public class MeasureTime {
    static LinkedList<String> date = new LinkedList<>();

    public static void main(String[] args) {
        // task0_MeashureTime();     // Task 0

        runTask1();                       // Task 1

    }

    private static void runTask1() {
        while (true) {
            String userEnter = task1_getStringFromUser();
            String[] arrStr = userEnter.split(":");
            String UserText = arrStr[0];
            int index = Integer.parseInt(arrStr[1]);
            if (index > date.size()) {
                for (int i = 0; i < index; i++) {
                    date.add(null);
                }
            }
            if (!userEnter.startsWith("print")) {
                date.add(index, UserText);
            } else {
                System.out.println(date.get(index));
                date.remove(index);
            }
            System.out.println(date);
        }
    }

    private static String task1_getStringFromUser() {
        System.out.print("Ввод: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void task0_MeashureTime() {
        int size = 10_000_000;

        List<Integer> arrayL = new ArrayList<>();
        List<Integer> linkedL = new LinkedList<>();


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedL.add(i);
        }
        long end2 = System.currentTimeMillis();
        double res2 = start2 - end2;
        System.out.printf("LinkedList time = %s %s %n", res2, "ms");

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayL.add(i);
        }
        long end = System.currentTimeMillis();
        double res = start - end;
        System.out.printf("ArrayList time = %s %s %n", res, "ms");
    }
}
