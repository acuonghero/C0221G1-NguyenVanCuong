package casestudy_furama_resort.model;

public abstract class Services {
    protected String serviceName;
    protected double areaUsed;
    protected double price;
    protected int capacity;
    protected String type;
    protected String id;

    public Services() {
    }

    public Services(String serviceName, double areaUsed, double price, int capacity, String type, String id) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.price = price;
        this.capacity = capacity;
        this.type = type;
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void showInfor();


}
