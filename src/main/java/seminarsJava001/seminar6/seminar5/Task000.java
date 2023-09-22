package seminarsJava001.seminar6.seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task000 {
    public static void main(String[] args) {
        HashMap<Integer, String> intToStringHashMap = new HashMap<>();
        intToStringHashMap.put(123456, "Ivanov");
        intToStringHashMap.put(234432, "Ivanov");
        intToStringHashMap.put(345678, "Ivanov");
        intToStringHashMap.put(321456, "Vasilyev");
        intToStringHashMap.put(234561, "Petrov");
        intToStringHashMap.put(654321, "Petrov");

        //for (Map.Entry<Integer, String> item : intToStringHashMap.entrySet()) {
        for (var item : intToStringHashMap.entrySet()) {
            if (item.getValue().equals("Ivanov")) {
                System.out.println(item.getKey());
            }
        }
    }
}
