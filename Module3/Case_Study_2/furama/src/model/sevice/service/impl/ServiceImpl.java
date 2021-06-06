package model.sevice.service.impl;

import model.bean.Service;
import model.repository.ServiceRepository;

public class ServiceImpl implements IService {
    ServiceRepository serviceRepository = new ServiceRepository();

    @Override
    public boolean insert(Service service) {
        return serviceRepository.insert(service);
    }
}
