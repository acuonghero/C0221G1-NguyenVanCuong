package model.sevice.customer.impl;

import model.bean.Customer;
import model.bean.CustomerType;
import model.common.Validate;
import model.repository.CustomerRepository;
import model.sevice.customer.ICustomer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements ICustomer {
    CustomerRepository customerRepository = new CustomerRepository();

    public List<String> insertInto(Customer customer){
        List<String> errList = new ArrayList<>();
        errList.add(Validate.checkName(customer.getCustomerName()));
        errList.add(Validate.checkDay(customer.getCustomerDayOfBirth()));
        errList.add(Validate.checkEmail(customer.getCustomerEmail()));
        errList.add(Validate.checkIdCard(customer.getCustomerIdentityCard()));
        errList.add(Validate.checkPhoneNumber(customer.getCustomerPhoneNumber()));
        errList.add(Validate.checkName(customer.getCustomerAddress()));
        int checkFull = 0;
        for (String string : errList){
            if (string.equals("")){
                checkFull++;
            }
        }
        if(checkFull == 6){
            customerRepository.insertCustomer(customer);
        }
        return errList;
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

    @Override
    public List<CustomerType> selectCustomerType() throws SQLException {
        return customerRepository.selectCustomerType();
    }


}
