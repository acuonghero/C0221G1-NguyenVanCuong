package controller;

import model.bean.Student;
import model.service.IStudentService;
import model.service.impl.IStudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private IStudentService studentService = new IStudentServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("do post =" + action);
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertStudent(request,response);
                    break;
                case "search":
                    findStudentName(request,response);
                    break;
                case "delete":
                    deleteStudent(request,response);
                    break;
                case "update":
                    updateStudent(request,response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Student student = new Student(name,gender,email,phone,birthday,address);
        Map<String, String> mapMsg = studentService.validateUpdate(id, student);
        if(mapMsg.isEmpty()){
            request.setAttribute("msg","Update suscessfull");
        }else {
            request.setAttribute("student",student);
            request.setAttribute("msg","Update failed");
            request.setAttribute("name",mapMsg.get("name"));
            request.setAttribute("phone",mapMsg.get("phone"));
            request.setAttribute("birthday",mapMsg.get("birthday"));
            request.setAttribute("email",mapMsg.get("email"));
            request.setAttribute("address",mapMsg.get("address"));
        }
        String [] genderList = {"Male","Female","Other"};
        request.setAttribute("gender",genderList);
        RequestDispatcher dispatcher= request.getRequestDispatcher("view/student/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
//        boolean check = false;
        studentService.deleteStudent(id);
        try {
            response.sendRedirect("/student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findStudentName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("findName");
        List<Student> studentList = studentService.findStudentName(name);
        request.setAttribute("students",studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Student student = new Student(name,gender,email,phone,birthday,address);
        Map<String, String> mapMsg = studentService.validateCreate(student);
        if(mapMsg.isEmpty()){
            request.setAttribute("msg","New create suscessfull");
        }else {
            request.setAttribute("student",student);
            request.setAttribute("msg","Create failed");
            request.setAttribute("name",mapMsg.get("name"));
            request.setAttribute("phone",mapMsg.get("phone"));
            request.setAttribute("birthday",mapMsg.get("birthday"));
            request.setAttribute("email",mapMsg.get("email"));
            request.setAttribute("address",mapMsg.get("address"));
        }
        RequestDispatcher dispatcher= request.getRequestDispatcher("view/student/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
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
                    showStudentList(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showUpdateTable(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.selectStudentById(id);
        request.setAttribute("student",student);
        String [] genderList = {"Male","Female","Other"};
        request.setAttribute("gender",genderList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateTable(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showStudentList(HttpServletRequest request, HttpServletResponse response) {
        List<Student> studentList = studentService.selectAllStudent();
        request.setAttribute("students",studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}