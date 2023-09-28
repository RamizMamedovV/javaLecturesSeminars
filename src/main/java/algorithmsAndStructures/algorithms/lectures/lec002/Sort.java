package algorithmsAndStructures.algorithms.lectures.lec002;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        int[] array = new int[10];
        createArray(array, 0, 10);
        printArray(array);
        bubbleSort(array);
        printArray(array);

    }

    public static void createArray(int[] arr, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(min, max);
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        boolean fin;
        do {
            fin = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    fin = false;
                }
            }
        } while (!fin);
    }
}
