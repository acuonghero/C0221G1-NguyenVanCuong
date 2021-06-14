package model.bean;

public class Product {
    private int id;
    private String name;
    private double price;
    private String color;
    private int quantity;
    private String describtion;
    private int category;

    public Product() {
    }

    public Product(String name, double price, String color, int quantity, String describtion, int category) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
        this.describtion = describtion;
        this.category = category;
    }

    public Product(int id, String name, double price, String color, int quantity, String describtion, int category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
        this.describtion = describtion;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}