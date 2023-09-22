package lecturesJava001.lecture1.lecture6Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
                                HASHSET
isEmpty() – проверка на пустоту.
add(V) – добавление элемента в коллекцию.
remove(V) – удаление элемента из коллекцию.
contains(V) – проверка на включение элемента в коллекции.
clear() – удаление всех элементов коллекции.
size() – возвращает количество элементов коллекции.

                        HashSet как синоним множества
addAll(Coll) – объединение множеств.
retainAll(Coll) – пересечение множеств.
removeAll(Coll) – разность множеств.

 */
public class Ex001HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

//        set.add(1); set.add(12); set.add(123);
//        set.add(1234); set.add(1234);
//        System.out.println(set.contains(12)); // true
//
//        set.add(null);
//        System.out.println(set.size()); // 5
//        System.out.println(set); // [null, 1, 1234, 123, 12]
//
//        set.remove(12);
//
//        for (var item : set) System.out.println(item); // null 1 1234 123
//
//        set.clear();
//        System.out.println(set); // []


                        // HashSet как синоним множества

        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
//        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
//        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
//        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
//        System.out.println(r); // [2, 3, 5, 7]
//        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        System.out.println(res);

    }
}
