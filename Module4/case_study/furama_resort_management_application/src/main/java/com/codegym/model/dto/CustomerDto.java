package com.codegym.model.dto;
import com.codegym.model.entity.CustomerType;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class CustomerDto{
    private Long id;
    @NotBlank(message = "Please in name !!!")
    private String name;
    @NotBlank(message = "Please in birthday !!!")
    private String birthday;
    private Integer gender;
    @NotBlank(message = "Please in id card !!!")
    private String idCard;
    @NotBlank(message = "Please in phone number !!!")
    @Pattern(regexp = "")
    private String phone;
    @NotBlank(message = "Please in email !!!")
    private String email;
    @NotBlank(message = "Please in address !!!")
    private String address;
    private CustomerType customerType;
}
