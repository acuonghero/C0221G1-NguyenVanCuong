package model.sevice.customer.impl;

import model.bean.Customer;
import model.repository.UserRepository;
import model.sevice.customer.ICustomer;

import java.sql.SQLException;
import java.util.List;

public class CustomerImpl implements ICustomer {
    UserRepository userRepository = new UserRepository();

//    @Override
//    public void insertCustomer(Customer customer) throws SQLException {
//        userRepository.insertCustomer(customer);
//    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    //    @Override
//    public Customer selectCustomer(int id) {
//        return userRepository.selectCustomer(id);
//    }
//
    @Override
    public List<Customer> selectAllCustomer() {
        return userRepository.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public List<Customer> sortAllCustomer() throws SQLException {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
//
//    @Override
//    public boolean deleteCustomer(int id) throws SQLException {
//        return userRepository.deleteCustomer(id);
//    }
//
//    @Override
//    public boolean updateUser(Customer customer) throws SQLException {
//        return userRepository.updateUser(customer);
//    }

//    @Override
//    public List<Customer> sortAllCustomer() throws SQLException {
//        return userRepository.sortAllCustomer();
//    }
//
//    @Override
//    public List<Customer> findByName(String name) {
//        return userRepository.findByName(name);
//    }
}
