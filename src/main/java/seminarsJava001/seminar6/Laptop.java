package seminarsJava001.seminar6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private String color;
    private int Id;
    private AtomicInteger counter = new AtomicInteger(0);
    //Map<Integer, HashMap<String, String>> laptops = n;

        public Laptop(String brand, String color) {
        //laptops = new HashMap<>();
        this.brand = brand;
        this.Id = counter.incrementAndGet();
        // laptops.put(Id)
        this.color = color;
    }

//    public Laptop(String brand) {
//        this.brand = brand;
//        ++Id;
//    }

    @Override
    public String toString() {
        return "Laptop: { Brand: " + this.brand + "id: " + this.Id + " }";
    }

    @Override
    public int compareTo(Laptop o) {

        return 0;
    }
}
