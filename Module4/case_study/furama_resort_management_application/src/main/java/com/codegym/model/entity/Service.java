package com.codegym.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long area;
    private Double cost;
    @Column(name = "max_people")
    private Long maxPeople;
    @ManyToOne(targetEntity = RentType.class)
    @JoinColumn(referencedColumnName = "id")
    private RentType rentType;
    @ManyToOne(targetEntity = ServiceType.class)
    @JoinColumn(referencedColumnName = "id")
    private ServiceType serviceType;

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
