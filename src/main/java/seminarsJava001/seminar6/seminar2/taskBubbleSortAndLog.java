package seminarsJava001.seminar6.seminar2;

/*Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
Напишите свой код в методе sort класса BubbleSort.
Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt'
в формате год-месяц-день час:минуты {массив на данной итерации}.
Пример
arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]*/


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void saveLog(int[] mas) throws IOException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String time = sd.format(new Date());
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;

                }
            }
            try {
                fileWriter.write(time + " " + Arrays.toString(mas) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void sort(int[] arr) {
        try {
            log = new File("newLog.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            saveLog(arr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class taskBubbleSortAndLog {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{9, 4, 8, 3, 1};

        BubbleSort.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("newLog.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//}class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//    //String logEntry
//
//    public static void saveLog(String arrString) throws IOException {
//        SimpleDateFormat sDateF = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Date date = new Date();
//        String stringDate = sDateF.format(date);
//
//        try {
//            log = new File("log.txt");
//            log.createNewFile();
//            fileWriter = new FileWriter(log, true); // Открываем файл для дополнения
//            fileWriter.write(stringDate + " " + arrString + "\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileWriter != null) {
//                    fileWriter.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void sort(int[] mas) throws IOException {
//
//        int min = mas[0];
//        for (int i = 0; i < mas.length - 1; i++) {
//            for (int j = i + 1; j < mas.length; j++) {
//                if (mas[j] < mas[i]) {
//                    min = mas[j];
//                    mas[j] = mas[i];
//                    mas[i] = min;
//                }
//            }
//            String s = Arrays.toString(mas);
//            saveLog(s);
//        }
//    }
//}
    /*log = new File("logfile.txt");

        try {
            // Создаем FileWriter для записи в файл
            FileWriter fileWriter = new FileWriter(log, true); // true позволяет дописывать в существующий файл
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            // Строка для записи в файл
            String logMessage = "Это строка для записи в файл.";

            // Записываем строку в файл
            printWriter.println(logMessage);

            // Закрываем файл
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/

/*class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
      boolean isSorted = false;
      int buffer;

      while (!isSorted) {
        isSorted = true;
        for (int i = 0; i < mas.length - 1; i++) {
          if (mas[i] > mas[i + 1]) {
            isSorted = false;
            buffer = mas[i];
            mas[i] = mas[i + 1];
            mas[i + 1] = buffer;
          }
        }
        logStep(Arrays.toString(mas));
      }
      return [] mas;
    }

    public static void logStep(String note){
      try {
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
          String timestamp = dateFormat.format(new Date());
          fileWriter.write(timestamp + " " + note + "\n");
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}*/