package model.repository;

import model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();

    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        String SELECT_ALL_CUSTOMER = "select * from customer;";
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String customerName = rs.getString("customer_name");
                String customerDayOfBirth = rs.getString("customer_Day_Of_Birth");
                String customerIdentityCard = rs.getString("customer_Identity_Card");
                String customerPhoneNumber = rs.getString("customer_Phone_Number");
                String customerEmail = rs.getString("customer_Email");
                String customerAddress = rs.getString("customer_Address");
                int customerTypeId = rs.getInt("customer_Type_Id");

                customers.add(new Customer(customerId,customerTypeId,customerName,customerDayOfBirth,customerIdentityCard,customerPhoneNumber,customerEmail,customerAddress));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
