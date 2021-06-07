package controller;

import model.bean.Contract;
import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;
import model.sevice.contract.IContract;
import model.sevice.contract.impl.ContractImpl;
import model.sevice.customer.ICustomer;
import model.sevice.customer.impl.CustomerImpl;
import model.sevice.employee.IEmployee;
import model.sevice.employee.impl.EmployeeImpl;
import model.sevice.service.IService;
import model.sevice.service.impl.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet",value = "/contract")
public class ContractServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IEmployee employeeServices = new EmployeeImpl();
    private ICustomer customerService = new CustomerImpl();
    private IService serviceService = new ServiceImpl();
    private IContract contractService = new  ContractImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertContract(request, response);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertContract(HttpServletRequest request, HttpServletResponse response) {
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        double totalMoney = Double.parseDouble(request.getParameter("totalMoney"));
        int employeeId =Integer.parseInt(request.getParameter("employeeId"));
        int customerId =Integer.parseInt(request.getParameter("customerId"));
        int serviceId =Integer.parseInt(request.getParameter("serviceId"));
        Contract contract = new Contract(startDate,endDate,deposit,totalMoney,employeeId,customerId,serviceId);
        contractService.insertContract(contract);
        try {
            response.sendRedirect("/contract");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do get =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                default:
                    showCreateContract(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showCreateContract(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeServices.selectAllEmployee();
        request.setAttribute("employee",employeeList);
        List<Customer> customerList = customerService.selectAllCustomer();
        request.setAttribute("customer",customerList);
        List<Service> serviceList = serviceService.selectAllService();
        request.setAttribute("service",serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}