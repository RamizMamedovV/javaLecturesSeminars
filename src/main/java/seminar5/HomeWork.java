package seminar5;

import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью Map,
учитывая, что 1 человек может иметь несколько телефонов
и у человека уникальное имя. Поработать с методами Map.
Отсортировать Map в обратном порядке.
 */
public class HomeWork {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneMap = new LinkedHashMap<>();
        phoneMap.put("Ivanov", new ArrayList<>());
        phoneMap.get("Ivanov").add("1234");
        phoneMap.get("Ivanov").add("1111");
        phoneMap.put("Petrov", new ArrayList<>());
        phoneMap.get("Petrov").add("1234");
        phoneMap.put("Bus", new ArrayList<>());
        phoneMap.get("Bus").add("8765");
        phoneMap.put("Clinton", new ArrayList<>());
        phoneMap.get("Clinton").add("4321");

        //System.out.println(phoneMap.entrySet());

        ListIterator<Map.Entry<String, ArrayList<String>>> reverseMap
                = new ArrayList<>(phoneMap.entrySet()).listIterator(phoneMap.size());

        while (reverseMap.hasPrevious()) {
            Map.Entry<String, ArrayList<String>> entry = reverseMap.previous();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
