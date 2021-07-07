package com.codegym.model.dto;

import com.codegym.model.entity.RentType;
import com.codegym.model.entity.ServiceType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class ServiceDto {
    private Long id;
    @NotBlank(message = "Please input Name")
    private String name;
    private Long area;
    private Double cost;
    private Long maxPeople;
    private RentType rentType;
    private ServiceType serviceType;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloor;

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
