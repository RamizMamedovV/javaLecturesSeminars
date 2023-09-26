package seminarsJava001.seminar6.seminar6;

import java.util.*;

public class LaptopMain {
    public static void main(String[] args) throws Exception {
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(new Laptop(Brand.HP, Color.BLACK));
        laptopSet.add(new Laptop(Brand.HP, Color.GREY));
        laptopSet.add(new Laptop(Brand.HP, Color.SILVER));
        laptopSet.add(new Laptop(Brand.ACER, Color.SILVER));
        laptopSet.add(new Laptop(Brand.ACER, Color.GREY));
        laptopSet.add(new Laptop(Brand.ASUS, Color.BLACK));

        Set<Brand> brandSet = new TreeSet<>();
        Set<Color> colorSet = new TreeSet<>();
        for (Laptop l : laptopSet) {
            brandSet.add(l.getBrand());
            colorSet.add(l.getColor());
        }
        Scanner sc = new Scanner(System.in);
        int userEnter = userEnter();
        Map<String, Object> userFilter = new HashMap<>();
        if (userEnter == 1) {
            System.out.println(brandSet);
            System.out.println("Введите бренд, для фильтрации:");
            Brand filter = Brand.valueOf(sc.nextLine().toUpperCase());
            userFilter.put("Brand", filter);

        } else if (userEnter == 2) {
            System.out.println(colorSet);
            System.out.println("Введите цвет, для фильтрации:");
            Color filter = Color.valueOf(sc.nextLine().toUpperCase());
            userFilter.put("Color", filter);

        }

        filterPrint(laptopSet, userFilter);

    }

    public static int userEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую критерию фильтрации:");
        System.out.println("1 - Бренд");
        System.out.println("2 - Цвет");
        return sc.nextInt();
    }

    public static void filterPrint(Set<Laptop> laptopSet,Map<String, Object> userFilter) {
        for (Laptop laptops : laptopSet) {
            boolean isAvailable = false;

            for (Map.Entry<String, Object> entries : userFilter.entrySet()) {
                String enKey = entries.getKey();
                Object enValue = entries.getValue();

                if (enKey.equals("Brand")) {
                    if (laptops.getBrand().equals(enValue)) {
                        isAvailable = true;
                    }
                } else if (enKey.equals("Color")) {
                    if (laptops.getColor().equals(enValue)) {
                        isAvailable = true;
                    }
                }
            }
            if (isAvailable) {
                System.out.println(laptops);
            }
        }
    }
}
