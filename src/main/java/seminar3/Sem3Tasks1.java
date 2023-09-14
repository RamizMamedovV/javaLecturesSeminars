package seminar3;

import java.util.*;

public class Sem3Tasks1 {
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


        /*                  Task 2.0 and 2.1
 Заполнить список названиями планет Солнечной системы в произвольном порядке
 с повторениями. Вывести название каждой планеты и количество его повторений в списке.

 2.1 Пройти по списку из предыдущего задания 2.0 и удалить повторяющиеся элементы*/

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
            res.add(planArr[i] + " : " + count);
        }
        System.out.println(res);

        // Task 2.1

        int length = planets.size();
        for (int i = 0; i < length; i++) {
            String temp = planets.get(i);
            for (int j = i + 1; j < length; j++) {
                if (temp.equals(planets.get(j))) {
                    planets.remove(j);
                    j--;    // Уменьшаем размер списка, так как удалили элемент
                    // Уменьшаем индекс j, чтобы проверить новый элемент на текущей позиции
                    length--;
                }
            }
        }
        System.out.println(planets);

    }
}
