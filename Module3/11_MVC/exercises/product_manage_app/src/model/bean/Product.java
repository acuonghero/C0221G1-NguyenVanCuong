package model.bean;

public class Product {
    private int id;
    private String productName;
    private String status;
    private String price;
    private String model;

    public Product() {
    }

    public Product(int id, String productName, String status, String price, String model) {
        this.id = id;
        this.productName = productName;
        this.status = status;
        this.price = price;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

