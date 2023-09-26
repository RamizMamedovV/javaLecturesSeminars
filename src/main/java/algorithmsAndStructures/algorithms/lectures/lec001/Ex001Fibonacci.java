package algorithmsAndStructures.algorithms.lectures.lec001;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex001Fibonacci {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(8, counter);
        System.out.println(fib);
        System.out.println(counter.get());

    }
    public static int fib(int num, AtomicInteger counter) {
        counter.incrementAndGet();
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return fib(num - 1, counter) + fib(num - 2, counter);
    }
}
