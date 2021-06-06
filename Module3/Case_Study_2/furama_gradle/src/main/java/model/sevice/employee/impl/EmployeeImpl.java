package model.sevice.employee.impl;

import model.bean.Division;
import model.bean.EducationDegree;
import model.bean.Employee;
import model.bean.Position;
import model.repository.EmployeeRepository;
import model.sevice.employee.IEmployee;

import java.util.List;

public class EmployeeImpl implements IEmployee {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Position> selectPosition() {
        return employeeRepository.selectPosition();
    }

    @Override
    public List<EducationDegree> selectEducation() {
        return employeeRepository.selectEducation();
    }

    @Override
    public List<Division> selectDivision() {
        return employeeRepository.selectDivision();
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return employeeRepository.selectAllEmployee() ;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.insertEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }

    @Override
    public Employee findEmployee(int id) {
        return employeeRepository.findEmployee(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeRepository.updateEmployee(id,employee);
    }
}
