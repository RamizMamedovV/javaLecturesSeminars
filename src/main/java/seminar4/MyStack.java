package seminar4;

/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size()- ск. эл-ов, empty()- bool(пустой или нет),
push()- вставить эл., peek()-взглянуть есть ли эл., pop()- удал.эл.
 */

import java.util.Arrays;

public class MyStack<T> {
    public static void main(String[] args) {
        MyStackClass<Integer> stack = new MyStackClass<>();
        stack.push(11);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
class MyStackClass<T> {
    private int top;
    private int capcity;
    private T[] array;

    public MyStackClass() {
        int size = 5;
        array = (T[]) new Object[size];
        capcity = size;
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public MyStackClass<T> push(T value) {
        if (isFull()) {
            addCapacity();
        }
        array[++top] = value;

        return this;
    }

    private boolean isFull() {
        return size() == capcity;
    }

    public boolean empty() {
        return top == -1;
    }

    public T peek() {
        if (!empty()) {
            return array[top];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        peek();
        return array[top--];
    }

    private void addCapacity() {
        T[] copy = (T[]) new Object[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capcity = array.length;
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";
        }

        return Arrays.toString(array);
    }
}
