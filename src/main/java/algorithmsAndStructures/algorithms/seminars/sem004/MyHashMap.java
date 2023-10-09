package algorithmsAndStructures.algorithms.seminars.sem004;

/**
 * Хеш-таблица
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap<K, V> {

    //region public methods

    /**
     * Поиск элемента в хеш-таблице по ключу
     *
     * @param key ключ
     * @return значение
     */
    public V get(K key) {
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return null;
        return bucket.get(key);
    }

    /**
     * Удаление элемента по ключу
     *
     * @param key ключ
     * @return значение
     */
    public V remove(K key) {
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return null;
        V temp = bucket.remove(key);
        if (temp != null)
            size--;
        return temp;
    }

    /**
     * Добавление нового элемента в хеш-таблицу
     *
     * @param key Ключ
     * @param val Значение
     * @return null - если добавлен или Значение, если перезаписан
     */
    public V put(K key, V val) {
        if (buckets.length * FILL_CONTROLLER <= size)
            recalculateBucketLength();
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];

        if (bucket == null) {
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }

        Entity entity = new Entity(key, val);
        V temp = bucket.add(entity);
        if (temp == null) {
            size++;
        }
        return temp;
    }

    /**
     * Override toString
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Bucket<K, V> bucket : buckets) {
            if (bucket != null) {
                Bucket<K, V>.Node node = bucket.head;
                if (node != null) {
                    do {
                        sb.append("key: " + node.value.key + " value: " + node.value.val + "\n");
                    } while (node.next != null);
                }
            }
        }
        return sb.toString();
    }

    //endregion

    //region methods

    private void recalculateBucketLength() {
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        size = 0;

        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket == null) {
                continue;
            }
            Bucket<K, V>.Node tempNode = bucket.head;
            while (tempNode != null) {
                put(tempNode.value.key, tempNode.value.val);
                tempNode = tempNode.next;
            }
        }
    }

    private int calculateBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    //endregion

    //region Конструкторы

    public MyHashMap() {
        this(INIT_BUCKET_COUNT);
    }

    public MyHashMap(int capacity) {
        buckets = new Bucket[capacity];
    }

    //endregion

    //region Поля
    private Bucket<K, V>[] buckets;

    private int size;   // Количество элементов

    //endregion

    // region Константы

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double FILL_CONTROLLER = 0.75;

    //endregion

    //region Вспомогательные структуры

    /**
     * элемент хеш таблицы
     */
    class Entity {
        /**
         * ключ
         */
        K key;
        /**
         * значение
         */
        V val;

        public Entity(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Связанный список
     *
     * @param <K>
     * @param <V>
     */
    class Bucket<K, V> {

        /**
         * Указатель на первый узел связанного списка
         */
        Node head;

        /**
         * Узел связанного списка
         */
        class Node {

            /**
             * Ссылка на следующий узел
             */
            Node next;

            /**
             * Значение узла
             */
            Entity value;
        }

        /**
         * Добавление нового элемента хеш-таблицы (на уровне связанного списка)
         *
         * @param entity Элемент хеш-таблицы
         * @return Значение старого элемента(если ключи совпадают)
         */
        private V add(Entity entity) {
            Node node = new Node();
            node.value = entity;

            if (head == null) {
                head = node;
                return null;
            }

            Node tempNode = head;
            while (true) {
                if (tempNode.value.key.equals(entity.key)) {
                    V temp = (V) tempNode.value.val;
                    tempNode.value.val = entity.val;
                    return temp;
                }
                if (tempNode.next != null) {
                    tempNode = tempNode.next;
                } else {
                    tempNode.next = node;
                    return null;
                }
            }
        }

        private V get(K key) {
            Node node = head;
            while (node != null) {
                if (node.value.key.equals(key))
                    return (V) node.value.val;
                node = node.next;
            }
            return null;
        }

        private V remove(K key) {
            if (head == null)
                return null;
            if (head.value.key.equals(key)) {
                V temp = (V) head.value.val;
                head = head.next;
                return temp;
            }
            Node node = head.next;
            while (node != null) {
                if (node.value.key.equals(key)) {
                    V temp = (V) node.value.val;
                    node = node.next;
                    return temp;
                }
                node = node.next;
            }
            return null;
        }
    }

    //endregion

}
