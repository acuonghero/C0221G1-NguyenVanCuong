package controller;

import model.bean.Customer;
import model.bean.CustomerType;
import model.sevice.customer.impl.CustomerImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerImpl customer;

    public void init() {
        customer = new CustomerImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("dopost" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertCustomer(request, response);
                    break;
                case "edit":
                    updateCustomer(request, response);
                    break;
                case "delete":
                    System.out.println("delete");
                    deleteCustomer(request, response);
                    break;
//            case "search":
//                searchUser(request,response);
//                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        System.out.println("id cura ewfe" + id);
         customer.deleteCustomer(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("client-id"));
        int customerTypeId = Integer.parseInt(request.getParameter("client-type-id"));
        String customerName = request.getParameter("client-name");
        String customerDayOfBirth = request.getParameter("client-day-of-birth");
        String customerGender = request.getParameter("client-gender");
        String customerIdentityCard = request.getParameter("client-identity-card");
        String customerPhoneNumber = request.getParameter("client-phone-number");
        String customerEmail = request.getParameter("client-email");
        String customerAddress = request.getParameter("client-address");

        Customer newCustomer = new Customer(customerTypeId, customerName, customerDayOfBirth, customerGender, customerIdentityCard, customerPhoneNumber, customerEmail, customerAddress);
        customer.updateCustomer(id, newCustomer);

        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) {
//        int customerTypeId = Integer.parseInt(request.getParameter("customer-type-id"));
////        String customerName = request.getParameter("client-name");
////        String customerDayOfBirth = request.getParameter("client-day-of-birth");
////        String customerGender = request.getParameter("client-gender");
////        String customerIdentityCard = request.getParameter("client-identity-card");
////        String customerPhoneNumber = request.getParameter("client-phone-number");
////        String customerEmail = request.getParameter("client-email");
////        String customerAddress = request.getParameter("client-address");
////
////        Customer newCustomer = new Customer(customerTypeId, customerName, customerDayOfBirth, customerGender, customerIdentityCard, customerPhoneNumber, customerEmail, customerAddress);
////        customer.insertCustomer(newCustomer);
////        try {
////            response.sendRedirect("/customer");
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        String customerCode = request.getParameter("code");
//        if (customerCode == null){
//            customerCode = "";
//        }
        String name = request.getParameter("client-name");
        if (name == null){
            name = "";
        }
        int typeCustomer = Integer.parseInt(request.getParameter("customer-type-id"));
        String date = request.getParameter("client-day-of-birth");
        if (date == null){
            date = "";
        }
        String gender = request.getParameter("client-gender");
        String email = request.getParameter("client-email");
        if (email == null){
            email = "";
        }
        String idCard = request.getParameter("client-identity-card");
        if (idCard == null){
            idCard = "";
        }
        String phone = request.getParameter("client-phone-number");
        if (phone == null){
            phone = "";
        }
        String address = request.getParameter("client-address");
        if (address == null){
            address = "";
        }
        Customer customers = new Customer(typeCustomer,name,date,gender,idCard,
                phone,email,address);
        try{
            List<String> errList = customer.insertInto(customers);
            int checkFull = 0;
            boolean check = false;
            for (String string : errList){
                if (string.equals("")){
                    checkFull++;
                }
            }
            if (checkFull == 6){
                check = true;
            }
            List<CustomerType> customerTypeList = customer.selectCustomerType();
            request.setAttribute("customerType", customerTypeList);
            for (int i = 0;i<errList.size();i++){
                request.setAttribute("err"+(i+1),errList.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            request.getRequestDispatcher("/view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        System.out.println("doget" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;

//                case "sort":
//                    sortUser(request,response);
//                    break;
                default:
                    customerList(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<CustomerType> customerTypeList = customer.selectCustomerType();
        request.setAttribute("customerType", customerTypeList);
        Customer customers = customer.selectById(id);
        request.setAttribute("customer", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/customer/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        List<CustomerType> customerTypeList = customer.selectCustomerType();
        request.setAttribute("customerType", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/customer/create.jsp");
        try {
             dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void customerList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customer.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
