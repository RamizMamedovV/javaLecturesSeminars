package myLibrary;

import java.util.Random;

public class Create_Int_Array {
    public static int[] createIntArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max);
        }
        return array;
    }

}
