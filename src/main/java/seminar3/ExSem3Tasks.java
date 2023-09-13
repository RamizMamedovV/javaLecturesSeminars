package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExSem3Tasks {
    public static void main(String[] args) {

        /*                  Task1
        Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.*/

//        List<Integer> list = new ArrayList<>();
//        Random rnd = new Random();
//        for (int i = 0; i < 10; i++) {
//            list.add(rnd.nextInt(10));
//        }
//        System.out.println(list + "\n" + "\n");
//
//        Collections.sort(list);
//        System.out.println(list);


        /*                  Task2
 Заполнить список названиями планет Солнечной системы в произвольном порядке
 с повторениями. Вывести название каждой планеты и количество его повторений в списке.*/

        Random random = new Random();
        List<String> planets = new ArrayList<>();
        String[] planArr = new String[]{"Mars", "Earth", "Jupiter", "Saturn", "Mercury"};
        for (int i = 0; i < 10; i++) {
            planets.add(planArr[random.nextInt(5)]);
        }
        System.out.println(planets);

        List<String> res = new ArrayList<>(5);
        for (int i = 0; i < planArr.length; i++) {
            int count = 0;
            for (String s : planets) {
                if (planArr[i].equals(s)) {
                    count++;
                }
            }
            res.add(planArr[i] + count);
        }
        System.out.println(res);
    }
}
