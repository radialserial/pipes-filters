package entities;

public class Order {

    private String id;
    private String buyer;
    private String product;

    public Order(String id, String buyer, String product) {
        this.id = id;
        this.buyer = buyer;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
