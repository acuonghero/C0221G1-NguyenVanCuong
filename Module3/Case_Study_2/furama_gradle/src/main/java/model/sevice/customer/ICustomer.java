package model.sevice.customer;

import model.bean.Customer;
import model.bean.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer {

    public Customer selectCustomer(int id);

    public List<Customer> selectAllCustomer();

    public boolean deleteCustomer(int id) throws SQLException;

//    public boolean updateCustomer(int id,Customer customer) throws SQLException;

    public List<Customer> sortAllCustomer() throws SQLException;

    public List<Customer> findByName(String name);

    public Customer selectById(int id);

    void updateCustomer(int id, Customer customer);

    List<CustomerType> selectCustomerType() throws SQLException;

    List<String> insertInto(Customer customer);
}
