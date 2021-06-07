package model.sevice.service;

import model.bean.RentType;
import model.bean.Service;
import model.bean.ServiceType;

import java.util.List;

public interface IService {
    void insert(Service service);
    List<ServiceType> selectServiceType();
    List<RentType> selectRentType();
    List<Service> selectAllService();
}
