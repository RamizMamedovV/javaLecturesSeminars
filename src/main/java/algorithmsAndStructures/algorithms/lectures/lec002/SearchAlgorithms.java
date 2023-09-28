package algorithmsAndStructures.algorithms.lectures.lec002;

public class SearchAlgorithms {
    public static void main(String[] args) {
        int[] array = new int[10];
        Sort.fillArray(array, 0, 10);
        Sort.printArray(array);
        System.out.println(findValue(array, 5));
        Sort.selectedSort(array);
        System.out.print("sorted array = ");
        Sort.printArray(array);
        System.out.println(binarySearch(array, 5));

    }

    public static int findValue(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int val) {
        return binarySearch(array,val, 0, array.length-1);
    }

    private static int binarySearch(int[] arr, int val, int start, int end) {
        int middle;

        if(start > end) return  -1;
        else middle = (start + end) / 2;

        if (arr[middle] == val) {
            return middle;
        } else if (arr[middle] > val) {
            return binarySearch(arr, val, start, middle -1);
        } else if (arr[middle] < val){
            return binarySearch(arr, val, middle + 1, end);
        } else return -1;
    }
}
