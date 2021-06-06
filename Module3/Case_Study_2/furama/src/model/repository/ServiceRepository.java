package model.repository;

import model.bean.Customer;
import model.bean.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();

    public boolean insert(Service service) {
        boolean rowInsert = false;
        String query = "insert into service(service_name,service_area,number_of_floors,service_max_people,service_costs,rent_type_id,service_type_id,standard_room,description_other_convernience,pool_area)\n" +
                "values (?,?,?,?,?,?,?,?,?,?),";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, service.getServiceName());
            preparedStatement.setInt(2, service.getServiceArea());
            preparedStatement.setInt(3, service.getNumberOfFloors());
            preparedStatement.setInt(4, service.getServiceMaxPeople());
            preparedStatement.setDouble(5, service.getServiceCost());
            preparedStatement.setInt(6, service.getRentTypeId());
            preparedStatement.setInt(7, service.getServiceTypeId());
            preparedStatement.setString(8, service.getStandardRoom());
            preparedStatement.setString(8, service.getDescriptionOtherConvenience());
            preparedStatement.setDouble(8, service.getPoolArea());
            System.out.println(preparedStatement);
            rowInsert= preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }


}
