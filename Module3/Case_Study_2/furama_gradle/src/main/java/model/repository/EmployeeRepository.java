package model.repository;

import model.bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository = new BaseRepository();

    public List<Position> selectPosition() {
        List<Position> positionList = new ArrayList<>();
        String query = "select * from `position`;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("position_id");
                String name = rs.getString("position_name");
                positionList.add(new Position(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positionList;
    }

    public List<EducationDegree> selectEducation() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        String query = "select * from education_degree;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("education_degree_id");
                String name = rs.getString("education_degree_name");
                educationDegreeList.add(new EducationDegree(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return educationDegreeList;
    }

    public List<Division> selectDivision() {
        List<Division> divisionList = new ArrayList<>();
        String query = "select * from `division`;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("division_id");
                String name = rs.getString("division_name");
                divisionList.add(new Division(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return divisionList;
    }

    public List<Employee> selectAllEmployee() {
        String query = "select * from employee;";
        List<Employee> employeeList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthday");
                String idCard = rs.getString("employee_id_card");
                String salary = rs.getString("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int position = rs.getInt("position_id");
                int educationDegree = rs.getInt("education_degree_id");
                int division = rs.getInt("division_id");
                String username = rs.getString("username");

                employeeList.add(new Employee(id, name, birthday, idCard, salary, phone, email, address, position, educationDegree, division, username));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public void insertEmployee(Employee employee) {
        String query = "insert into employee (employee_name,position_id,education_degree_id,division_id,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username)\n" +
                "values(?,?,?,?,?,?,?,?,?,?,?);";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setInt(2, employee.getPositionId());
            preparedStatement.setInt(3, employee.getEducationDegreeId());
            preparedStatement.setInt(4, employee.getDivisionId());
            preparedStatement.setString(5, employee.getEmployeeBirthday());
            preparedStatement.setString(6, employee.getEmployeeIdCard());
            preparedStatement.setString(7, employee.getEmployeeSalary());
            preparedStatement.setString(8, employee.getEmployeePhone());
            preparedStatement.setString(9, employee.getEmployeeEmail());
            preparedStatement.setString(10, employee.getEmployeeAddress());
            preparedStatement.setString(11, employee.getUserName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee findEmployee(int id) {
        String query = "select * from employee where employee_id = ?;";
        Employee employees = null;
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int ids = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthday");
                String idCard = rs.getString("employee_id_card");
                String salary = rs.getString("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int position = rs.getInt("position_id");
                int educationDegree = rs.getInt("education_degree_id");
                int division = rs.getInt("division_id");
                String username = rs.getString("username");
                employees = new Employee(ids, name, birthday, idCard, salary, phone, email, address, position, educationDegree, division, username);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public boolean deleteEmployee(int id) {
        String query = "DELETE FROM employee\n" +
                "WHERE employee_id = ?";
        boolean rowDeleted = false;
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }


    public void updateEmployee(int id, Employee employee) {
        String query = "update employee\n" +
                "set employee_name=?,\n" +
                "position_id=?,\n" +
                "education_degree_id=?,\n" +
                "division_id=?,\n" +
                "employee_birthday=?,\n" +
                "employee_id_card=?,\n" +
                "employee_salary=?,\n" +
                "employee_phone=?,\n" +
                "employee_email=?,\n" +
                "employee_address=?,\n" +
                "username=?\n" +
                "where employee_id=?;";
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,employee.getEmployeeName());
            preparedStatement.setInt(2,employee.getPositionId());
            preparedStatement.setInt(3,employee.getEducationDegreeId());
            preparedStatement.setInt(4,employee.getDivisionId());
            preparedStatement.setString(5,employee.getEmployeeBirthday());
            preparedStatement.setString(6,employee.getEmployeeIdCard());
            preparedStatement.setString(7,employee.getEmployeeSalary());
            preparedStatement.setString(8,employee.getEmployeePhone());
            preparedStatement.setString(9,employee.getEmployeeEmail());
            preparedStatement.setString(10,employee.getEmployeeAddress());
            preparedStatement.setString(11,employee.getUserName());
            preparedStatement.setInt(12,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
