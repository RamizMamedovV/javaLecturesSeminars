package exampleDataStructure.stackExample;
/*
Реализуйте стек при помощи очереди.
Обратите первые k элементов в очереди.
Сгенерируйте двоичные числа от 1 до n при помощи очереди
 */
public class Main {
    public static void main(String[] args) {

        StackWithQueue stack = new StackWithQueue();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.top());
        System.out.println(stack);
    }
}
