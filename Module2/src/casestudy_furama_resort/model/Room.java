package casestudy_furama_resort.model;

public class Room extends Services {

    public Room() {
    }

    public Room(String serviceName, double areaUsed, double price, int capacity, String type, String id) {
        super(serviceName, areaUsed, price, capacity, type, id);
    }

    @Override
    public void showInfor() {
        System.out.println("Services{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUsed=" + areaUsed +
                ", price=" + price +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}');
    }
}
