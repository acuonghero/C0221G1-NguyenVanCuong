package model.sevice.employee;

import model.bean.Division;
import model.bean.EducationDegree;
import model.bean.Employee;
import model.bean.Position;

import java.util.List;

public interface IEmployee {
    List<Position> selectPosition();
    List<EducationDegree> selectEducation();
    List<Division> selectDivision();
    List<Employee> selectAllEmployee();
    void insertEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee findEmployee(int id);
    void updateEmployee(int id,Employee employee);
}
