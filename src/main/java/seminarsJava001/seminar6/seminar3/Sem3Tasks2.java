package seminarsJava001.seminar6.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sem3Tasks2 {
    public static void main(String[] args) {

        /*              Task3
        Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
*/

//        List list = new ArrayList();
//        list.add("asd");
//        list.add("df");
//        list.add(12);
//        list.add(34);
//        list.add("fg");
//
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Number) {
//                list.remove(list.get(i));
//                i--;
//            }
//        }
//        System.out.println(list);
//        list.removeIf(item -> item.equals("df")); // Удаление элементов, удовлетворяющих условию
//
//        // Вывод списка после удаления
//        System.out.println(list);


        /*                  Task4
        Каталог товаров книжного магазина сохранен в виде двумерного списка
  List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка
   содержится название жанра, а на остальных позициях - названия книг.
   Напишите метод для заполнения данной структуры. */

//        List<ArrayList<String>> bookSt = new ArrayList<>();
//
//        bookSt.add(new ArrayList<String>());
//        bookSt.add(new ArrayList<String>());
//        bookSt.add(new ArrayList<String>());
//
//        for (int i = 0; i < bookSt.size(); i++) {
//            for (ArrayList<String> inner : bookSt) {
//                for (int j = 0; j < inner.size(); j++) {
//                    inner.add("Проза");
//                    inner.add("Война и мир");
//                    inner.add("12 стульв");
//                }
//                inner.add("Поэзия");
//                inner.add("Документ");
//            }
//        }
//        for (ArrayList<String> inner : bookSt) {
//            System.out.println(inner);
//        }

        // Создаем список списков
        List<ArrayList<String>> bookSt = new ArrayList<>();

// Добавляем внутренний список (пустой)
        bookSt.add(new ArrayList<>());
        bookSt.add(new ArrayList<>());
        bookSt.add(new ArrayList<>());

// Добавляем элемент во внутренний список по индексу
        int index = 3; // индекс внутреннего списка, к которому мы хотим добавить элемент
        int innerIndex = 4;
        String[] genres = new String[3];
        genres[0] = "Проза";
        genres[1] = "Поэзия";
        genres[2] = "Документ";

        String[] prose = new String[4];
        prose[0] = "war and peace";
        prose[1] = "12 chars";
        prose[2] = "cosmos";
        prose[3] = "cosmos1";
        String[] poetry = new String[4];
        poetry[0] = "Поэзия1";
        poetry[1] = "Поэзия2";
        poetry[2] = "Поэзия3";
        poetry[3] = "Поэзия4";
        String[] documentary = new String[4];
        documentary[0] = "documentary1";
        documentary[1] = "documentary2";
        documentary[2] = "documentary3";
        documentary[3] = "documentary4";

        for (int i = 0; i < index; i++) {
            bookSt.get(i).add(genres[i]);
        }
        for (int i = 0; i < innerIndex; i++) {
            bookSt.get(0).add(prose[i]);
        }
        for (int i = 0; i < innerIndex; i++) {
            bookSt.get(1).add(poetry[i]);
        }
        for (int i = 0; i < innerIndex; i++) {
            bookSt.get(2).add(documentary[i]);
        }
        System.out.println(bookSt);

    }
}
