package com.codegym.model.dto;

import com.codegym.model.entity.AttachService;
import com.codegym.model.entity.Contract;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContractDetailDto {
    private Long id;
    private Contract contract;
    private AttachService attachService;
    private Long quantity;
}
