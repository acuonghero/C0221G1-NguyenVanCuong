package controller;

import model.bean.*;
import model.sevice.customer.impl.CustomerImpl;
import model.sevice.service.impl.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/service")
public class ServiceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ServiceImpl service;

    public void init() {
        service = new ServiceImpl();
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
                    insertService(request, response);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertService(HttpServletRequest request, HttpServletResponse response) {
        String serviceName = request.getParameter("name");
        int serviceArea = Integer.parseInt(request.getParameter("area"));
        double serviceCost = Double.parseDouble(request.getParameter("cost"));
        int serviceMaxPeople = Integer.parseInt(request.getParameter("max-people"));
        int rentTypeId = Integer.parseInt(request.getParameter("rent-type"));
        int serviceTypeId = Integer.parseInt(request.getParameter("service-type"));
        String standardRoom = request.getParameter("standard-room");
        String descriptionOtherConvenience = request.getParameter("description-other-convernience");
        double poolArea = Double.parseDouble(request.getParameter("pool-area"));
        int numberOfFloors = Integer.parseInt(request.getParameter("number-of-floors"));

        Service services = new Service(serviceName, serviceArea, serviceCost, serviceMaxPeople, rentTypeId, serviceTypeId, standardRoom, descriptionOtherConvenience,poolArea,numberOfFloors);
        service.insert(services);
        try {
            response.sendRedirect("/service?action=create");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("doget" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateService(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showCreateService(HttpServletRequest request, HttpServletResponse response) {
        List<RentType> rentTypeList = service.selectRentType();
        request.setAttribute("rentType", rentTypeList);
        List<ServiceType> serviceTypeList = service.selectServiceType();
        request.setAttribute("serviceType", serviceTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/service/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
