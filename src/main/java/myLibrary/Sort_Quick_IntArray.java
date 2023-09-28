package myLibrary;


public class Sort_Quick_IntArray {
    public static void main(String[] args) {

        int[] arr = Create_Int_Array.createIntArray(10, 0, 10);

        Print_IntArray.printArray(arr);
        quickSort(arr);
        Print_IntArray.printArray(arr);

    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int pivot = array[(start + end) / 2];

        do {
            while (array[left] < pivot) left++;

            while (array[right] > pivot) right--;

            if (left <= right) {
                if (left < right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < end) quickSort(array, left, end);

        if (start < right) quickSort(array, start, right);
    }
}
