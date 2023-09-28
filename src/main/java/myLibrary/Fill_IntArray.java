package myLibrary;

import java.util.Random;

public class Fill_IntArray {

    public static void fillArray(int[] arr, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(min, max);
        }
    }
}
