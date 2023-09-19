package lecture5HashMap;

import java.util.HashMap;
import java.util.Map;

/*
put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.
 */
public class Ex001_HashMap {
    public static void main(String[] args) {
//        Map<Integer, String> db = new HashMap<>();
//        db.putIfAbsent(1, "один");
//        db.put(2, "два");
//        db.put(null, "!null");
//        System.out.println(db); // {null=!null, 1=один, 2=два}
//         System.out.println(db.get(44));
//        db.remove(null);
//        System.out.println(db); // {1=один, 2=два}
//        System.out.println(db.containsValue("один")); // true
//        System.out.println(db.containsValue(1)); // false
//        System.out.println(db.containsKey("один")); // false
//        System.out.println(db.containsKey(1)); // true
//        System.out.println(db.keySet());
//        System.out.println(db.values());

//        for (var item : db.entrySet()) {        // entrySet() -  для итерации
//            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//        }

        // HashMap. Важное дополнение #2. Скорость
        Map<Integer,String> map1 = new HashMap<>(); // по умолчанию - размер 16
        Map<Integer,String> map2 = new HashMap<>(9);// размер 9
        // при заполнении около 75% будет увеличение в 2 раза
        // иначе можно самому задать этот "%" : например 1.0f - 100 %
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);

                            // неизменяемый Map

// Map<Character, Character> bracketPairs = Map.of('{', '}', '<', '>', '(', ')', '[', ']');
        // map = Map.ofEntries(Map.entry('[', ']'), Map.entry('(', ')'));

/*      HashMap. Любознательным
● Хэш-функции и хэш-таблицы
● Прямое связывание (хэширование с цепочками)
● Хэширование с открытой адресацией
● Теория графов:
    ● деревья построенные на списках
    ● бинарные деревья
    ● сбалансированные деревья
    ● *алгоритм балансировки дерева
    ● ** красно-черные деревья, деревья поиска

 */
    }
}
