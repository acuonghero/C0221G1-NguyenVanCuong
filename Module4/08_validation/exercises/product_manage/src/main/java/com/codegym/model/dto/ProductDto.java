package com.codegym.model.dto;

import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;

@Data
public class ProductDto implements Validator {
    private Long id;
    @NotBlank(message = "Please input name !!")
    private String name;
    private Integer price;
    @NotBlank(message = "Please input describe !!")
    private String describes;
    @NotBlank(message = "Please input producer !!")
    private String producer;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        String regexProductName = "^[A-Z]([a-z]*)([0-9]*)$";
        ProductDto productDto= (ProductDto) target;
        if (productDto.price==null){
            errors.rejectValue("price",null,"Please input number");
        }
        if (!productDto.name.matches(regexProductName)){
            errors.rejectValue("name",null,"Invalid format name");
        }
    }
}
