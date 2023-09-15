package seminar4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/*              Task 2
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class TaskReverseDeque {
    static Deque<String> date = new ArrayDeque<>();

    public static void main(String[] args) {

        run();
    }

    private static String getStringFromUser() {
        System.out.print("Ввод: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static void run() {
        while (true) {
            String userEnter = getStringFromUser();
            if (userEnter.equalsIgnoreCase("q")) {
                System.exit(0);
            }else if (userEnter.equalsIgnoreCase("print")) {
                System.out.println(date);
            } else if (userEnter.equalsIgnoreCase("revert")) {
                date.pop();
                System.out.println(date);
            } else {
                date.push(userEnter);
            }
        }
    }
}
