package seminar4;

import java.util.LinkedList;

/*
В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
Пример
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements());
// [1, 10, 15, 5]

queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
// [15, 5]

System.out.println(queue.first());
// 15
 */
class MyQueue<T> {
    LinkedList<T> lList = new LinkedList<>();

    public void enqueue(T element) {
        // Напишите свое решение ниже
        lList.addLast(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        return lList.pollFirst();
    }

    public T first() {
        // Напишите свое решение ниже
        return lList.pollFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return lList;
    }

}

public class MyLinkedList {
    public static void main(String[] args) {

        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
