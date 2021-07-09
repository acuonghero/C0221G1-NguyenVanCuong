package com.codegym.model.dto;

import com.codegym.model.entity.Customer;
import com.codegym.model.entity.Employee;
import com.codegym.model.entity.Service;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Getter
@Setter
public class ContractDto {
    private Long id;
    @NotBlank(message = "Please input !!")
    private String startDate;
    @NotBlank(message = "Please input !!")
    private String endDate;
    @NotNull(message = "Please input !!!")
    private Double deposit;
    private Double totalMoney;
    private Employee employee;
    private Customer customer;
    private Service service;
}
