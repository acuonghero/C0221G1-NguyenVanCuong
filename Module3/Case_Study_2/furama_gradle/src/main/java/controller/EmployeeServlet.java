package controller;

import model.bean.*;
import model.sevice.customer.impl.CustomerImpl;
import model.sevice.employee.impl.EmployeeImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet",value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeImpl employee;

    public void init() {
        employee = new EmployeeImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try{
            switch (action){
                case "delete":
                    deleteEmployee(request, response);
                    break;
                case "create":
                    insertEmployee(request, response);
                    break;
                case "edit":
                    updateEmployee(request, response);
                    break;
                case "search":
                    searchByName(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("findName");
        List<Employee> employeeList = employee.SearchByName(name);
        request.setAttribute("employees",employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/employee/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("id-card");
        String salary = request.getParameter("salary");
        String phone = request.getParameter("phone-number");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int educationDegree = Integer.parseInt(request.getParameter("educationDegree"));
        int division = Integer.parseInt(request.getParameter("division"));
        String username = request.getParameter("username");
        Employee employees = new Employee(name,birthday,idCard,salary,phone,email,address,position,educationDegree,division,username);
        employee.updateEmployee(id,employees);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("id-card");
        String salary = request.getParameter("salary");
        String phone = request.getParameter("phone-number");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int educationDegree = Integer.parseInt(request.getParameter("educationDegree"));
        int division = Integer.parseInt(request.getParameter("division"));
        String username = request.getParameter("username");
        Employee employees = new Employee(name,birthday,idCard,salary,phone,email,address,position,educationDegree,division,username);
        employee.insertEmployee(employees);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        System.out.println("id cura ewfe" + id);
        employee.deleteEmployee(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        System.out.println("doget =" + action);
        if (action == null) {
            action = "";
        }
        try{
            switch (action){
                case "create":
                    showCreateForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                default:
                    showEmployeeList(request,response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Position> positionList = employee.selectPosition();
        request.setAttribute("positions", positionList);
        List<EducationDegree> educationDegreeList = employee.selectEducation();
        request.setAttribute("educations", educationDegreeList);
        List<Division> divisionList = employee.selectDivision();
        request.setAttribute("divisions", divisionList);
        Employee employees = employee.findEmployee(id);
        request.setAttribute("employee",employees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/employee/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEmployeeList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employee.selectAllEmployee();
        request.setAttribute("employees",employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/employee/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positions = employee.selectPosition();
        request.setAttribute("positions", positions);
        List<EducationDegree> educationDegreeList = employee.selectEducation();
        request.setAttribute("educations", educationDegreeList);
        List<Division> divisionList = employee.selectDivision();
        request.setAttribute("divisions", divisionList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/employee/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
