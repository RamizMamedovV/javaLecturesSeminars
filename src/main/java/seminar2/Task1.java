package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {

        // Task1
/* Дано четное число N (>0) и строки c1 и c2.
// Написать метод, чтобы вернуть строку длины N*2,
// которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.*/
        // System.out.println(concatString(4));


        // Task2
        /*Напишите метод, который сжимает строку.
Пример: "aaaabbbcdd" → a4b3cd2
*/
        // System.out.println(compressString("aaabbnnsss"));

        // Task 3
    /*Напишите метод, который принимает на вход строку (String)
    и определяет, является ли строка палиндромом (возвращает boolean значение).*/

        // System.out.println(palindromeString("al la alla "));

        // Task4
        /*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.*/

        String string = createrString("TEST\n", 100);
        System.out.println(string);
        System.out.println(writeFile(string));


    }

    public static String createrString(String str, int amount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            sb.append(str);
        }
        String res = sb.toString();
        return res;
    }

    public static boolean writeFile(String str) {
        FileWriter file = null;
        try {
            file = new FileWriter("fileTask4.txt", false);
            file.write(str);
            file.flush();
            return true;
        } catch (IOException e) {
            System.out.println("filed" + e.getMessage());
        }
        return false;
    }


    public static boolean palindromeString(String string) {
        String str = string.replaceAll("\\s", "");
        int len = str.length();
        int half = str.length() / 2;

        for (int i = 0; i < half; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static String compressString(String str) {
        StringBuilder res1 = new StringBuilder();
        int count = 1;
        char cnt = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (cnt == str.charAt(i)) {
                count++;
            } else {
                res1.append(cnt).append(count);
                cnt = str.charAt(i);
                count = 1;
            }
        }
        res1.append(cnt).append(count);
        String res = res1.toString();

        return res;
    }


    public static String concatString(int n) {

        String str1 = "c1";
        String str2 = "c2";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(str1).append(str2);
        }
        return sb.toString();
    }

}
