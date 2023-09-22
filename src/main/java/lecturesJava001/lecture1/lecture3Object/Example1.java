package lecturesJava001.lecture1.lecture3Object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        //Sum(1, 1.2);
        //System.out.println(Sum(1, 1.2)); // для этого переименовать void в Object
        // и завернуть return (Object)((Double) a + (Double) b);

        //                  Массивы

//        int[] a = new int[] {1, 2};
//        int[] b = new int[3];
//        System.arraycopy(a, 1, b, 0, 1);
//        for (int x: b) {
//            System.out.printf("%d ", x);
//        }

        //            <<interface>> Collection (NOT COLLECTIONS)
        /*                      Коллекции     Функционал
        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – gjvtoftn значение item элементу, который находится
на позиции pos
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end

clear() – очистка списка
toString() – «конвертация» списка в строку
Arrays.asList – преобразует массив в список
containsAll(col) – проверяет включение всех элементов из col
removeAll(col) – удаляет элементы, имеющиеся в col
retainAll(col) – оставляет элементы, имеющиеся в col
toArray() – конвертация списка в массив Object’ов
toArray(type array) – конвертация списка в массив type
List.copyOf(col) – возвращает копию списка на основе имеющегося
List.of(item1, item2,...) – возвращает неизменяемый список
*/

//        List<Integer> list = new ArrayList<>(5);
//        list.add(111);
//        list.add(222);
//        list.add(333);
//        list.add(444);
//        List<Integer> list1 = new ArrayList<>(list.subList(1,3));
//        //list1 = list.subList(1,3);
//        // list.add("kkj");
//        for (Object o : list) {
//            System.out.println(o.getClass().arrayType());
//        }
//        for (Object o : list1) {
//            System.out.println(o);
//        }

//        int day = 26;
//        int year = 1978;
//        int month = 12;
//        Integer[] date = {day, month, year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);  // [26, 12, 1978]

//        StringBuilder day = new StringBuilder("26");
//        StringBuilder month = new StringBuilder("12");
//        StringBuilder year = new StringBuilder("1978");
//        StringBuilder[] date = new StringBuilder[]{day, month, year};
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);  // [26, 12, 1978]
//        date[0] = new  StringBuilder("25");
//        month.append(" - December");
//        System.out.println(d);  // [25, 12 - December, 1978]


        //             коллекция созданная с помощью List.of
//        Character value = null;
//        List<Character> list = List.of('R', 'a', 'm', 'i', 'z');
//        //list.add('l'); // UnsupportedOperationException
//        // коллекция созданная с помощью List.of так просто удалить не получится
//
//        System.out.println(list);   // [R, a, m, i, z]
//        List<Character> list1 = new ArrayList<>(list);
//        list1.add('l');
//        list1.remove(2);
//        System.out.println(list1);  // [R, a, i, z, l]


        //                  Iterator
/*Получение итератора с целью более гибкой работы с данными
https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
Enumeration в Java Collections Framework. Итераторы отличаются от
перечислений двумя способами:
Итераторы позволяют вызывающей стороне удалять элементы из
базовой коллекции во время итерации с четко определенной
семантикой.
hasNext(), next(), remove()
ListIterator<E>
https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
*/

        List<Integer> list = List.of(1,2,12,22,123);

//        for (int i : list) {
//            System.out.printf("%d ", i);    // 1 2 12 22 123
//        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        StringBuilder sb = new StringBuilder();
        while (col.hasNext()) {
            // col.remove();   // UnsupportedOperationException нельзя удалять
            //System.out.printf("%d ", col.next()); // 1 2 12 22 123
            // col.next(); нельзя при итерации 2 раза обращаться
            sb.append(col.next() + " ");  // 1 2 12 22 123
        }
        System.out.println(sb);

    }

    static void Sum(Object a, Object b) {
        if(a instanceof Double && b instanceof Double) {
            System.out.println((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Double) {
            System.out.println(((Integer) a + (Double) b));
        } else System.out.println(0);
    }
}
