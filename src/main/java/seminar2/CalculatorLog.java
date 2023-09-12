package seminar2;
/*Возьмите код от калькулятора с прошлого урока.
К этому калькулятору нужно добавить логирование.
Логи запишите в файл log.txtв формате:
"гггг-мм-дд чч:мм User entered the first operand = {первое число}"
"гггг-мм-дд чч:мм User entered the operation = {оператор}"
"гггг-мм-дд чч:мм User entered the second operand = {второе число}"
"гггг-мм-дд чч:мм Result is {результат}"*/

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Calculator1 {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        return 0;
    }
}
public class CalculatorLog {
    private static final String LOG_FILE_PATH = "logCalc.txt";

    public static void main(String[] args) {
            int a = 0;
            char op = ' ';
            int b = 0;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = 3;
                op = '+';
                b = 7;
            } else {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
            }

            clearLogFile();
            Calculator1 calculator = new Calculator1();
            int result = calculator.calculate(op, a, b);
            System.out.println(result);

            try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void clearLogFile() {
            File logFile = new File(LOG_FILE_PATH);
            if (logFile.exists()) {
                try {
                    FileWriter fileWriter = new FileWriter(logFile, false);
                    fileWriter.write("");
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
