package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double cost;
    private Long unit;
    private String status;
    @OneToMany(mappedBy = "attachService")
    List<ContractDetail> contractDetailList;
}
