package seminarsJava001.seminar6.seminar1;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String ex = sc.nextLine();
        String expression = " 5? + ?4 = 65 ";

        if (expression.contains("+")) {
            String[] partsAll = getPartsAll(expression);
            int[] indexes = new int[2];
            int index = 0;
            for (int i = 0; i < partsAll.length; i++) {
                if (partsAll[i].contains("?")) {
                    indexes[index] = i;
                    index++;
                }
            }
            for (int i = 0; i < indexes.length; i++) {
                System.out.println(indexes[i]);
            }
            String par1 = partsAll[0];
            String par2 = partsAll[1];
            String res = partsAll[2];
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
//            if(par1.contains("?")){
//                num1.getNum(par1);
//            }

        }
    }

    public static String[] getPartsAll(String str) {
        String[] parts = new String[0];
        if (str.length() != 0) {
            parts = str.split("[=+/*-]");

        }
        return parts;
    }

    public static int getRes(String[] str, char ch) {
        int res = 0;


        return res;
    }


}
//        String ex = "5?";
//        char num1 = ex.charAt(0);
//        char num2 = ex.charAt(1);
//        System.out.println(num1);
//        System.out.println(num2);

//        int number = 0b1010; // Двоичное число 1010 (десятичное 10)
//
//// Инвертировать второй бит с помощью ^ и маски
//        int mask = 0b0010; // Маска с единицей на второй позиции
//        int result = number ^ mask; // Исключающее ИЛИ с маской
//
//        System.out.println(Integer.toBinaryString(result)); // Вывод: 1000 (десятичное 8)

