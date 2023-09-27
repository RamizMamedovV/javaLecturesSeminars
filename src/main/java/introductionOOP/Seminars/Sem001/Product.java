package introductionOOP.Seminars.Sem001;

public class Product {
    String name;
    String brand;
    double price;

    public Product(String name, String brand, double price) {
        setName(name);
        setBrand(brand);
        setPrice(price);

    }

    public Product() {
        this("<Product>");
    }

    public Product(String name) {
        this(name, 100);
    }

    public Product(String name, double price) {
        this(name, "<Brand>", price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<Brand>";
        } else {
            this.brand = brand;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<Product>";
        } else {
            this.name = name;
        }
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
