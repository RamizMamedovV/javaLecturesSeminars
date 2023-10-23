package exampleDataStructure.stackExample;
import java.util.LinkedList;
import java.util.Queue;
/*
Сгенерируйте двоичные числа от 1 до n при помощи очереди
 */
class GenerateBinaryNumbers {
    public void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1"); // Начнем с 1

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            System.out.println(current);

            String withZero = current + "0";
            String withOne = current + "1";

            queue.offer(withZero);
            queue.offer(withOne);
        }
    }
}

