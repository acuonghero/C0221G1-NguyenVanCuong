package com.codegym.model.dto;

import com.codegym.model.entity.RentType;
import com.codegym.model.entity.ServiceType;

public class ServiceDto {
    private String name;
    private Long area;
    private Double cost;
    private Long maxPeople;
    private RentType rentType;
    private ServiceType serviceType;
}
