package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthday;
    private String idCard;
    private Double salary;
    private String phone;
    private String email;
    private String address;
    private boolean flag=true;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Position position;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Division division;
//    @ManyToOne(targetEntity = AppUser.class)
//    @JoinColumn(name = "username",referencedColumnName = "userName")
//    private AppUser user;
    @OneToMany(mappedBy = "employee")
    List<Contract> contractList;
}
