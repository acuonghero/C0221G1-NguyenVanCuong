package model.sevice.customer;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer selectCustomer(int id);

    public List<Customer> selectAllCustomer();

    public boolean deleteCustomer(int id) throws SQLException;

//    public boolean updateCustomer(int id,Customer customer) throws SQLException;

    public List<Customer> sortAllCustomer() throws SQLException;

    public List<Customer> findByName(String name);

    public Customer selectById(int id);

    void updateCustomer(int id,Customer customer);
}
