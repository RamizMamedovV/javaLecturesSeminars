package seminarsJava001.seminar6.seminar4;


import java.util.*;

public class ExampleQueueListSteckArrayList {
    public static void main(String[] args) {


                                // LinkedList
        //LinkedList<Integer> list1 = new LinkedList<>();
//
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.addFirst(0);
//
//        System.out.println(list1);
//        System.out.println(list1.peekLast());   // return last element
//        System.out.println(list1.pollLast());   // return last element and delete id
//
////        Collections.reverse(list1); // used API
////        System.out.println(list1);
//        int size = list1.size();
//
//        ListIterator fwd = list1.listIterator();
//        ListIterator rev = list1.listIterator(size);
//        for (int i = 0, mid = list1.size() >> 1; i < mid; i++) {
//            Object tmp = fwd.next();
//            fwd.set(rev.previous());
//            rev.set(tmp);
//        }
//
//        System.out.println(list1);
//
//        // Integer[] array = list1.toArray(new Integer[3]);             объекты Integer могут вызывать методы
//        int[] array = list1.stream().mapToInt(Integer :: intValue).toArray(); // объекты int не могут вызывать методы
//        System.out.println("array = " + Arrays.toString(array));
//        System.out.println(array[0] + array[2]);
//        int elem = array[0];                                                // объекты int не могут вызывать методы



                                //      PriorityQueue Queue Deque

//        PriorityQueue<Integer> listQ = new PriorityQueue<>();
//
//        listQ.add(1);
//        listQ.add(2);
//        listQ.add(3);
//        listQ.add(3);
//        listQ.add(5);
//        listQ.add(4);
//        System.out.println(listQ);
//        listQ.remove();
//        System.out.println(listQ);
//        Integer a = listQ.poll();
//        System.out.println(a);
//        System.out.println(listQ);
//        listQ.remove(5);
//        System.out.println(listQ);
//        System.out.println(listQ.peek());

//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
//
//        priorityQueue.add("Andrew");
//        priorityQueue.add("John");
//        priorityQueue.add("Rob");
//
//        System.out.println(priorityQueue);
//
//        while (!priorityQueue.isEmpty()) {
//            System.out.println(priorityQueue.remove());
//        }

        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(8);
        queue.add(3);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.offerFirst(0));
        System.out.println(queue);
        System.out.println(queue.pollLast());
        System.out.println(queue);
        System.out.println(queue.removeLastOccurrence(3));
        System.out.println(queue);
    }
}
