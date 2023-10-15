package introductionOOP.Seminars.Sem006;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveOrderToJson saveToFile = new SaveOrderToJson(order, "fff");
        saveToFile.saveTo();
    }
}
