package model.repository;

import model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class CustomerRepository {
    BaseRepository baseRepository = new BaseRepository();

    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        String SELECT_ALL_CUSTOMER = "select * from customer;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String customerName = rs.getString("customer_name");
                int customerTypeId = rs.getInt("customer_Type_Id");
                String customerPhoneNumber = rs.getString("customer_Phone_Number");
                String customerAddress = rs.getString("customer_Address");
                customers.add(new Customer(customerId, customerTypeId, customerName,customerPhoneNumber,customerAddress));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void insertCustomer(Customer customer) {
        String query = "insert into customer (customer_type_id,customer_name,customer_day_of_birth,customer_gender,customer_identity_card,customer_phone_number,customer_email,customer_address)\n" +
                "values (?,?,?,?,?,?,?,?);";
        try {
            Connection connection = baseRepository.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerDayOfBirth());
            preparedStatement.setString(4, customer.getCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdentityCard());
            preparedStatement.setString(6, customer.getCustomerPhoneNumber());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerAddress());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer selectById(int id) {
       Customer customer = null;
        String SELECT_BY_ID = "select * from customer where customer_id=?;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int customerId =rs.getInt("customer_id");
                int customerTypeId = rs.getInt("customer_type_id");
                String customerGender= rs.getString("customer_gender");
                String customerName = rs.getString("customer_name");
                String customerDayOfBirth = rs.getString("customer_Day_Of_Birth");
                String customerIdentityCard = rs.getString("customer_Identity_Card");
                String customerPhoneNumber = rs.getString("customer_Phone_Number");
                String customerEmail = rs.getString("customer_Email");
                String customerAddress = rs.getString("customer_Address");
                customer=new Customer(customerId,customerTypeId,customerName, customerDayOfBirth,customerGender,customerIdentityCard,customerPhoneNumber,customerEmail,customerAddress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public void updateCustomer(int id,Customer customer) {
//        customer_type_id,customer_name,customer_day_of_birth,customer_gender,customer_identity_card,customer_phone_number,customer_email,customer_address
        String query = " update customer\n" +
                " set customer_type_id=?,\n" +
                " customer_name=?,\n" +
                " customer_day_of_birth=?,\n" +
                " customer_gender=?,\n" +
                " customer_identity_card=?,\n" +
                " customer_phone_number=?,\n" +
                " customer_email=?,\n" +
                " customer_address=?\n" +
                " where customer_id=?;";
        try {
            Connection connection = baseRepository.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerDayOfBirth());
            preparedStatement.setString(4, customer.getCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdentityCard());
            preparedStatement.setString(6, customer.getCustomerPhoneNumber());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerAddress());
            preparedStatement.setInt(9, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteCustomer(int id) {
        String query = "DELETE FROM customer\n" +
                "WHERE customer_id = ?";
        System.out.println(query);
        boolean rowDeleted = false;
        try {Connection connection = baseRepository.getConnection();
             PreparedStatement statement = connection.prepareStatement(query) ;
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
            System.out.println(rowDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;

    }
}
