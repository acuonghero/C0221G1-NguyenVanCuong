package model.bean;

public class AttachService {
    private int id;
    private String name;
    private double cost;
    private int unit;
    private String status;

    public AttachService() {
    }

    public AttachService(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AttachService(String name, double cost, int unit, String status) {
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
    }

    public AttachService(int id, String name, double cost, int unit, String status) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
    }
}
