package seminarsJava001.seminar6.seminar2;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class ExampleLog {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(ExampleLog.class.getName());

        // Создание FileHandler для записи логов в файл
        FileHandler fileHandler = new FileHandler("sort.log");

        // Настройка формата записей логов
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        // Добавление обработчика в логгер
        logger.addHandler(fileHandler);

        int[] array = {5, 3, 1, 4, 2};

        // Логирование исходного массива
        logger.info("Исходный массив: " + arrayToString(array));

        // Пузырьковая сортировка
        bubbleSort(array, logger);

        // Логирование отсортированного массива
        logger.info("Отсортированный массив: " + arrayToString(array));
    }

    public static void bubbleSort(int[] arr, Logger logger) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Логирование обмена элементов
                    logger.info("Обмен элементов: arr[" + (i - 1) + "] и arr[" + i + "]");
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

