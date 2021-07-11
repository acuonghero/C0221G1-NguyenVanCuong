package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "date")
    private String startDate;
    @Column(columnDefinition = "date")
    private String endDate;
    private Double deposit;
    private Double totalMoney;
    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(referencedColumnName = "id")
    private Employee employee;
    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(referencedColumnName = "id")
    private Customer customer;
    @ManyToOne(targetEntity = Service.class)
    @JoinColumn(referencedColumnName = "id")
    private Service service;
    @OneToMany(mappedBy = "contract")
    List<ContractDetail> contractDetailList;
    private boolean flag=true;
}
