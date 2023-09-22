package lecturesJava001.lecture1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        int k = 2; // Задайте степень многочлена k

        List<Integer> coefficients = generateCoefficients(k);

        System.out.println("Сгенерированный многочлен:");
        printPolynomial(coefficients);
    }

    // Генерация случайных коэффициентов от 0 до 100 для многочлена степени k
    private static List<Integer> generateCoefficients(int k) {
        List<Integer> coefficients = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= k; i++) {
            coefficients.add(random.nextInt(101)); // Генерируем случайное число от 0 до 100
        }

        return coefficients;
    }

    // Вывод многочлена на экран
    private static void printPolynomial(List<Integer> coefficients) {
        int k = coefficients.size() - 1;

        for (int i = 0; i <= k; i++) {
            int coefficient = coefficients.get(i);

            if (coefficient != 0) {
                if (i == 0) {
                    System.out.print(coefficient);
                } else {
                    System.out.print(" + " + coefficient + "*x^" + i);
                }
            }
        }

        System.out.println(" = 0");
    }
}

