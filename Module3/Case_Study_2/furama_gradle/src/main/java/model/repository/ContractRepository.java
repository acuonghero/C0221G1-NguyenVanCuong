package model.repository;

import model.bean.Contract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContractRepository {
    BaseRepository baseRepository = new BaseRepository();
    public void insertContract(Contract contract){
        String query= "insert into contract(contract_start_date,contract_end_date,contract_deposits,contract_total_money,employee_id,customer_id,service_id)\n" +
                "values (?,?,?,?,?,?,?);";
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,contract.getContractStartDate());
            preparedStatement.setString(2,contract.getContractEndDate());
            preparedStatement.setDouble(3,contract.getContractDeposit());
            preparedStatement.setDouble(4,contract.getContractTotalMoney());
            preparedStatement.setInt(5,contract.getEmployeeId());
            preparedStatement.setInt(6,contract.getCustomerId());
            preparedStatement.setInt(7,contract.getServiceId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
