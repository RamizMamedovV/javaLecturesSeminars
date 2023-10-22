package exampleDataStructure;

import java.util.Stack;

public class PostfixExpressionCalculator {

    /**
     * Вычисления постфиксного выражение при помощи стека
     * @param expression строка постфиксного типа "22 33 +"
     * @return double
     */
    public static double calculatePostfixExpression(String expression) {
        Stack<Double> floatStack = new Stack<>();
        String[] strExpression = expression.split(" ");

        for (String s : strExpression) {
            if (!s.contains("+") && !s.contains("*")) {
                floatStack.push(Double.parseDouble(s));
            } else {
                double second = floatStack.pop();
                double first = floatStack.pop();
                switch (s){
                    case "+" -> {return first + second;}
                    case "-" -> {return first - second;}
                    case "*" -> {return first * second;}
                    default -> {return first / second;}
                }
            }
        }

        return 0;
    }
    public static int evaluatePostfixExpression(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // Если символ - цифра, преобразуем его в число и помещаем в стек
                stack.push(Character.getNumericValue(c));
            } else if (c == ' ') {
                // Пропускаем пробелы
                continue;
            } else {
                // Если символ - оператор, извлекаем два операнда из стека, выполняем операцию и помещаем результат обратно в стек
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, c);
                stack.push(result);
            }
        }

        // Результат должен остаться на вершине стека
        return stack.pop();
    }

    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '-' -> {
                return operand1 - operand2;
            }
            case '*' -> {
                return operand1 * operand2;
            }
            case '/' -> {
                if (operand2 == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Недопустимый оператор: " + operator);
        }
    }

    public static void main(String[] args) {
        String postfixExpression = "31+ 4 + 5 *";
        int result = evaluatePostfixExpression(postfixExpression);
        System.out.println("Результат: " + result);
    }
}
