package seminar5;

import java.util.*;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь

 */
public class Task002DequeMap {
    public static void main(String[] args) {
        System.out.println(isTrueBrackets("a+(d*3)"));
        System.out.println(isTrueBrackets("[a+(1*3)"));
        System.out.println(isTrueBrackets("[6+(3*3)]"));
        System.out.println(isTrueBrackets("{a}[+]{(d*3)}"));
        System.out.println(isTrueBrackets("<{a}+{(d*3)}>"));
        System.out.println(isTrueBrackets("{a+]}{(d*3)}"));


    }

    private static boolean isTrueBrackets(String exp) {

        Deque<Character> openBracketStack = new ArrayDeque<>();
        Map<Character, Character> bracketPairs = new HashMap<>();
        fillMap(bracketPairs);
        //fillStack(openBracketStack); // не понадобился

        for (char ch : exp.toCharArray()) {
            if (bracketPairs.containsKey(ch)) {
                openBracketStack.add(ch);
                System.out.println(openBracketStack);
            } else if (bracketPairs.containsValue(ch)) {
                if (openBracketStack.isEmpty()) {
                    return false;
                }

                char top = openBracketStack.removeLast();
                if (bracketPairs.get(top) != ch) {
                    return false;
                }
            }
        }

        return openBracketStack.isEmpty();
    }

    private static void fillMap(Map<Character, Character> map) {
        map.put('{', '}');
        map.put('<', '>');
        map.put('(', ')');
        map.put('[', ']');

        // map = Map.of('{', '}', '<', '>', '(', ')', '[', ']'); // неизменяемый Map
        // map = Map.ofEntries(Map.entry('[', ']'), Map.entry('(', ')'));
    }

    private static void fillStack(Deque<Character> openBrackets) {
        openBrackets.push('{');
        openBrackets.push('<');
        openBrackets.push('(');
        openBrackets.push('[');
    }
}
