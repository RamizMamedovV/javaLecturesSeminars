package seminarsJava001.seminar6.seminar1;

// Задание 3.
//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//вывести максимальное количество подряд идущих 1.

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1,0, 1, 1, 1,1,1,1,1,1};
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if(count > res) {
                    res = count;
                }
            } else  {
                count = 0;
            }
        }
        System.out.println(res);
    }
}

