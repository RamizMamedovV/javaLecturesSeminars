package exceptions.Sem003;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divTest(5, 0));
        } catch (MyDivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
                fileNotFoundTask("asdf");
            } catch (Task2_MyFileNotFoundException e) {
                System.out.println( e.getMessage());
        }

    }

    /**
     * Метод для деления целых чисел
     * @param dividend делимое
     * @param divisor делитель
     * @return частное
     * @throws MyDivisionByZeroException Исключение при делении на ноль
     */
    public static int divTest(int dividend, int divisor) throws MyDivisionByZeroException {
        int quotient;           //частное
        try {
            quotient = dividend / divisor;
        }
        catch (ArithmeticException e) {
            throw new MyDivisionByZeroException(String.format("Нельзя делить на %d", divisor));
        }
        return quotient;
    }

    /**
     * Метод для вызова собственного исключения
     * @param fileName file name
     * @throws Task2_MyFileNotFoundException собственное исключение
     */
    public static void fileNotFoundTask(String fileName) throws Task2_MyFileNotFoundException {
        try (FileReader fileReader = new FileReader(fileName)){
            System.out.println(fileReader.read());
        } catch (FileNotFoundException e) {
            throw new Task2_MyFileNotFoundException(String.format("the file %s was not found", fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
