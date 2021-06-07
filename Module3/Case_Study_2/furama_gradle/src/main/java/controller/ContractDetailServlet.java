package controller;

import model.bean.AttachService;

import model.sevice.contract.IContract;
import model.sevice.contract.impl.ContractImpl;
import model.sevice.contract_detail.IContractDetailService;
import model.sevice.contract_detail.impl.ContractDetailServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractDetailServlet", value = "/contractdetail")
public class ContractDetailServlet extends HttpServlet {

    private IContractDetailService contractDetailService = new ContractDetailServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertContractDetail(request, response);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertContractDetail(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateContractDetail(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showCreateContractDetail(HttpServletRequest request, HttpServletResponse response) {

        List<AttachService> attachServiceList = contractDetailService.selectAllAttachService();
        request.setAttribute("attachService",attachServiceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract_detail/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
