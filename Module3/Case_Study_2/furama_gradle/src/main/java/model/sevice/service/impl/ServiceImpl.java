package model.sevice.service.impl;

import model.bean.RentType;
import model.bean.Service;
import model.bean.ServiceType;
import model.repository.ServiceRepository;
import model.sevice.service.IService;

import java.util.List;

public class ServiceImpl implements IService {
    ServiceRepository serviceRepository = new ServiceRepository();

    @Override
    public void insert(Service service) {
        serviceRepository.insert(service);
    }

    @Override
    public List<ServiceType> selectServiceType() {
        return serviceRepository.selectServiceType();
    }

    @Override
    public List<RentType> selectRentType() {
        return serviceRepository.selectRentType();
    }
}
