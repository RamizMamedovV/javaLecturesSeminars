package algorithmsAndStructures.algorithms.seminars.sem004;

/*2. (Дополнительная, необязательная задача) Добавить возможность перебора всех элементов
нашей структуры данных, необходимо добавить несколько элементов,
а затем перебрать все элементы структуры HashTable используя цикл foreach.
Подумайте, возможно вам стоит обратиться к интерфейсу Iterable
и в рамках имплементации подобного интерфейса создать объект типа Iterator,
далее, вы реализуете метод next и hasNext,
наделите способностью нашу структуру HashMap быть перечисляемой.
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> my = new MyHashMap<>(3);
        String res = my.put(12, "rr");
        my.put(1, "qq");
        my.put(5, "dd");
        my.put(2, "ww");
        my.put(3, "ree");
        my.put(3, "aa");
        my.put(4, "ss");
        my.put(5, "ddgg");
        my.put(6, "dd");
        my.put(7, "dd");
        my.put(8, "dd");

        System.out.println(my.remove(3));
        System.out.println(my.get(3));

        System.out.println(my);
    }
}
