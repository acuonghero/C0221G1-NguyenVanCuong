package com.codegym.model.dto;

import com.codegym.model.entity.Division;
import com.codegym.model.entity.EducationDegree;
import com.codegym.model.entity.Position;
import com.codegym.model.entity.AppUser;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    @NotBlank(message = "Please input Name !!!")
    private String name;
    @NotBlank(message = "Please input birthday !!!")
    private String birthday;
    @NotBlank(message = "Please input id card !!!")
    private String idCard;
    private Double salary;
    @NotBlank(message = "Please input phone !!!")
    private String phone;
    @NotBlank(message = "Please input email !!!")
    private String email;
    @NotBlank(message = "Please input address !!!")
    private String address;
    private Position position;
    private EducationDegree educationDegree;
    private Division division;
    private AppUser user;
}
