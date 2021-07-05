package com.codegym.model.dto;

import lombok.Data;
import javax.validation.constraints.Pattern;

@Data
public class CustomerTypeDto {
    private Long id;
    @Pattern(regexp = "^[A-Z]([a-z]*)+([0-9]*)$",message = "Invalid format name !!!")
    private String name;
}
