package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Role role;
    @ManyToOne
//    @JoinColumn(referencedColumnName = "id")
    @JoinColumn(referencedColumnName = "userName")
    private User user;
}
