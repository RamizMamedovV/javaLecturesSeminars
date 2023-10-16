package introductionOOP.Seminars.Sem007.builder;

public class Order {
    private String name;
    private String nameClient;
    private String nameProduct;
    private String id;
    private int qnt;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", nameClient='" + nameClient + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", id='" + id + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
}
