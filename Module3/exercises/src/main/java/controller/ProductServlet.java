package controller;

import model.bean.Category;
import model.bean.Product;
import model.bean.Student;
import model.service.IProductService;
import model.service.impl.IProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new IProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertProduct(request,response);
                    break;
//                case "search":
//                    findProductName(request,response);
//                    break;
                case "delete":
                    deleteProduct(request,response);
                    break;
//                case "update":
//                    updateProduct(request,response);
//                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String gender = request.getParameter("gender");
//        String phone = request.getParameter("phone");
//        String birthday = request.getParameter("birthday");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
//        Student student = new Student(name,gender,email,phone,birthday,address);
//        Map<String, String> mapMsg = productService.(id, student);
//        if(mapMsg.isEmpty()){
//            request.setAttribute("msg","Update suscessfull");
//        }else {
//            request.setAttribute("student",student);
//            request.setAttribute("msg","Update failed");
//            request.setAttribute("name",mapMsg.get("name"));
//            request.setAttribute("phone",mapMsg.get("phone"));
//            request.setAttribute("birthday",mapMsg.get("birthday"));
//            request.setAttribute("email",mapMsg.get("email"));
//            request.setAttribute("address",mapMsg.get("address"));
//        }
//        String [] genderList = {"Male","Female","Other"};
//        request.setAttribute("gender",genderList);
//        RequestDispatcher dispatcher= request.getRequestDispatcher("view/student/update.jsp");
//        try {
//            dispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
//        boolean check = false;
        productService.deleteProduct(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void findProductName(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("findName");
//        List<Product> productList = productService.findProductName(name);
//        request.setAttribute("students",studentList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/list.jsp");
//        try {
//            dispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String color = request.getParameter("color");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String describtion = request.getParameter("describtion");
        int category = Integer.parseInt(request.getParameter("category"));
        Product product = new Product(name,price,color,quantity,describtion,category);
        productService.insertProduct(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do get =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateTable(request,response);
                    break;
                case "edit":
                    showUpdateTable(request,response);
                    break;
                default:
                    showProductList(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showUpdateTable(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
//        Product product = productService.selectStudentById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateTable(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = productService.seclectAllCategory();
        request.setAttribute("category",categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.selectAllProduct();
        request.setAttribute("products",productList);
        List<Category> categoryList = productService.seclectAllCategory();
        request.setAttribute("category",categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}