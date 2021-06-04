package model.sevice.customer.impl;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.sevice.customer.ICustomer;
import java.util.List;

public class CustomerImpl implements ICustomer {
    CustomerRepository customerRepository = new CustomerRepository();



    @Override
    public void insertCustomer(Customer customer) {
         customerRepository.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }


    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }


    @Override
    public List<Customer> sortAllCustomer(){
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public Customer selectById(int id) {
        return customerRepository.selectById(id);
    }

    @Override
    public void updateCustomer(int id,Customer customer) {
        customerRepository.updateCustomer(id,customer);
    }


}
