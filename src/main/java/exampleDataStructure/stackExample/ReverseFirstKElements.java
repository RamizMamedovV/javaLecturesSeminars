package exampleDataStructure.stackExample;

import java.util.Queue;
import java.util.Stack;
/*
Обратите первые k элементов в очереди
 */
class ReverseFirstKElements {
    public void reverseFirstK(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            throw new IllegalArgumentException("Неверное значение k");
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }
}

