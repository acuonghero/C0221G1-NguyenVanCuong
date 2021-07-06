package com.codegym.model.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthday;
    private Integer gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private boolean flag;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;
    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
