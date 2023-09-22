package seminarsJava001.seminar6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBookLinkedHashMap {
    private static Map<String, ArrayList<String>> nameToPhones = new LinkedHashMap<>();
    public static void main(String[] args) {
        fill();
        System.out.println(nameToPhones);
        sort();
        System.out.println(nameToPhones);
    }
    private static void fill() {
        nameToPhones.put("Ivanov", new ArrayList<>());
        nameToPhones.put("Petrov", new ArrayList<>());
        nameToPhones.put("Sidorov", new ArrayList<>());

        //addPhones("Ivanov", "1234");
        addPhones("Ivanov", "1111");
        addPhones("Petrov","1234");
        addPhones("Sidorov","8765");
        addPhones("Sidorov","4321");
    }
    private static void addPhones(String name, String phones) {
        nameToPhones.get(name)
                .add(phones);
    }

    private static void sort() {
        nameToPhones = nameToPhones.entrySet()
                .stream()
                .sorted(new PhoneBookComparator())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
    }
}
