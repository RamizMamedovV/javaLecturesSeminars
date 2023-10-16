package introductionOOP.Seminars.Sem007.builder;

public class Main {
    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .setId("pp")
                .setName("mm")
                .setNameClient(";;")
                .build();

        System.out.println(order);
    }
}
