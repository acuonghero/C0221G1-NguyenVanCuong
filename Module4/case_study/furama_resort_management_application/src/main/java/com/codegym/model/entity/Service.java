package com.codegym.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloor;
}
