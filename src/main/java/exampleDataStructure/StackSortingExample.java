package exampleDataStructure;

import java.util.Stack;

public class StackSortingExample {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            // Перенос элементов из временного стека обратно в исходный стек,
            // чтобы создать отсортированный порядок
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Временный стек содержит элементы в отсортированном порядке,
        // переносим их обратно в исходный стек
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Исходный стек: " + stack);
        sortStack(stack);
        System.out.println("Отсортированный стек: " + stack);
    }
}

