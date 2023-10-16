package introductionOOP.Seminars.Sem007.builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder setName(String name) {
        order.setName(name);
        return this;
    }

    public OrderBuilder setNameClient(String nameClient) {
        order.setNameClient(nameClient);
        return this;
    }

    public OrderBuilder setNameProduct(String nameProduct) {
        order.setNameProduct(nameProduct);
        return this;
    }

    public OrderBuilder setId(String id) {
        order.setId(id);
        return this;
    }

    public OrderBuilder setQnt(int qnt) {
        order.setQnt(qnt);
        return this;
    }

    public OrderBuilder setPrice(double price) {
        order.setPrice(price);
        return this;
    }

    public Order build() {
        if (order.getId() == null || order.getPrice() == 0 || order.getQnt() == 0) {
            throw new RuntimeException("order could not be without Id or price or qnt");
        } else {
            return order;
        }
    }
}
