package model.repository;

import model.bean.RentType;
import model.bean.Service;
import model.bean.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();

    public void insert(Service service) {

        String query = "insert into service(service_name,service_area,service_costs,service_max_people,rent_type_id,service_type_id,standard_room,description_other_convernience,pool_area,number_of_floors)\n" +
                "values (?,?,?,?,?,?,?,?,?,?);";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, service.getServiceName());
            preparedStatement.setInt(2, service.getServiceArea());
            preparedStatement.setDouble(3, service.getServiceCost());
            preparedStatement.setInt(4, service.getServiceMaxPeople());
            preparedStatement.setInt(5, service.getRentTypeId());
            preparedStatement.setInt(6, service.getServiceTypeId());
            preparedStatement.setString(7, service.getStandardRoom());
            preparedStatement.setString(8, service.getDescriptionOtherConvenience());
            preparedStatement.setDouble(9, service.getPoolArea());
            preparedStatement.setInt(10, service.getNumberOfFloors());
//            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<ServiceType> selectServiceType() {
        List<ServiceType> serviceTypes = new ArrayList<>();
        String query = "select * from service_type;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("service_type_id");
                String name = rs.getString("service_type_name");
                serviceTypes.add(new ServiceType(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypes;
    }

    public List<RentType> selectRentType() {
        List<RentType> rentTypes = new ArrayList<>();
        String query = "select * from rent_type;";
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("rent_type_id");
                String name = rs.getString("rent_type_name");
                double cost = rs.getDouble("rent_type_cost");
                rentTypes.add(new RentType(id,name,cost));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rentTypes;
    }

    public List<Service> selectAllService() {
        List<Service> serviceList = new ArrayList<>();
        String query = "select * from service;";
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("service_id");
                String name = rs.getString("service_name");
                serviceList.add(new Service(id,name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serviceList;
    }
}
