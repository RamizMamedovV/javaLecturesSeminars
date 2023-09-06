package seminar1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MMM.yyyy г." +
                ", время: hh ч. hh ч. mm мин. ss сек.");
        System.out.println(formatter.format(now));

        run();
    }

    private static void run() {
        String mask = "%s %s!%n";
        String hello = "";

        LocalTime now = LocalTime.now();
        System.out.println("Введите имя: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(12,0))) {
            hello = "Доброе утро, ";
        } else if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(18,0))) {
            hello = "Добрый день, ";
        } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(23,0))) {
            hello = "Добрый вечер, ";
        }  else {
            hello = "Доброй ночи, ";
        }
        System.out.printf(mask, hello, name);
    }
}
