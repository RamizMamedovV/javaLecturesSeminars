package introductionOOP.Seminars.Sem001;

public class Product {
    String name;
    String brand;
    double price;

//    public Product(String name) {
//        this.name = name;
//    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
