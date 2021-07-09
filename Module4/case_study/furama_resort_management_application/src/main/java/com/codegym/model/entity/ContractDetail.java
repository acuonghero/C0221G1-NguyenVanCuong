package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Contract.class)
    @JoinColumn(referencedColumnName = "id")
    private Contract contract;
    @ManyToOne(targetEntity = AttachService.class)
    @JoinColumn(referencedColumnName = "id")
    private AttachService attachService;
    private Long quantity;
}
