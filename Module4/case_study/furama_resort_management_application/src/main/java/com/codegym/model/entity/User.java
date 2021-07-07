package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String userName;
    private String password;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;
    @OneToMany(mappedBy = "user")
    List<UserRole> userRoleList;
}
