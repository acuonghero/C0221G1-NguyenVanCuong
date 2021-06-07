package model.repository;

import model.bean.AttachService;
import model.bean.Contract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository {
    BaseRepository baseRepository = new BaseRepository();
    public List<AttachService> selectAllAttachService(){
        String query= "select * from attach_service;";
        List<AttachService> attachServiceList =new ArrayList<>();
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("attach_service_id");
                String name = rs.getString("attach_service_name");
                attachServiceList.add(new AttachService(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceList;
    }

    public List<Contract> selectAllContract() {
        String query = "select * from contract;";
        List<Contract> contractList = new ArrayList<>();
        try{
            Connection connection =baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("contract_id");
                contractList.add(new Contract(id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractList;
    }
}
