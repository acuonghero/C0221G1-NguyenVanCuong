package com.codegym.model.dto;

import com.codegym.model.entity.Division;
import com.codegym.model.entity.EducationDegree;
import com.codegym.model.entity.Position;
import com.codegym.model.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String name;
    private String birthday;
    private String idCard;
    private Double salary;
    private String phone;
    private String email;
    private String address;
    private Position position;
    private EducationDegree educationDegree;
    private Division division;
    private User user;
}
