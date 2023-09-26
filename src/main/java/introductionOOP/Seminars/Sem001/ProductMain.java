package introductionOOP.Seminars.Sem001;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product3 = new BottleOfWater("ooo Бел", "Вода1"
        , 50.00, 1);
        product1.brand = "bb";
        System.out.println(product3.toString());
        Product product2 = new Product();
        //System.out.println(product2);
    }
}
