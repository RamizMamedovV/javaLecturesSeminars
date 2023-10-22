package exampleDataStructure;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !areBracketsMatching(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean areBracketsMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "[(])";

        System.out.println("Выражение 1 сбалансировано: " + areParenthesesBalanced(expression1));
        System.out.println("Выражение 2 сбалансировано: " + areParenthesesBalanced(expression2));
    }
}

