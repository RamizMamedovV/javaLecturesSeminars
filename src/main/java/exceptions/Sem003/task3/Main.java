package exceptions.Sem003.task3;

import java.util.Random;

public class Main {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        try(Counter counter = new  Counter(10)) {
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getCount());
            if (rnd.nextInt(2) == 0)
                counter.close();    //вызов для возбуждения исключения
            counter.add();
            System.out.println(counter.getCount());
        } catch (CloseCounterException e) {
            System.out.println(e.getMessage());
        }
    }
}
