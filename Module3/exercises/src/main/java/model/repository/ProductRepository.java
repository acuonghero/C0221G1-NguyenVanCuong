package model.repository;

import model.bean.Category;
import model.bean.Product;
import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    BaseRepository baseRepository = new BaseRepository();

    public List<Product> selectAllProduct() {
        String query = "select * from product;";
        List<Product> productList = new ArrayList<>();

        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String describtion = rs.getString("describtion");
                int category = rs.getInt("category");
                productList.add(new Product(id,name,price,color,quantity,describtion,category));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
//
//    public List<Student> findStudentName(String name) {
//        String query = "select * from student where student_name like ?;";
//        List<Product> studentList = new ArrayList<>();
//        try{
//            Connection connection = baseRepository.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"%"+name+"%");
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()){
//                int id = rs.getInt("student_id");
//                String names = rs.getString("student_name");
//                String gender = rs.getString("student_gender");
//                String email = rs.getString("student_email");
//                String phone =rs.getString("student_phone");
//                String birthday = rs.getString("student_birthday");
//                String address = rs.getString("student_address");
//                studentList.add(new Product(id,names,gender,email,phone,birthday,address));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return studentList;
//    }

    public boolean deleteProduct(int id) {
        boolean rowDelete = false;
        String query = "delete from product\n" +
                "where id = ?;";
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            rowDelete = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public void insertProduct(Product product) {
        String query= "insert into product (`name`,price,quantity,color,describtion,category)" +
                "values(?,?,?,?,?,?);";
        try{
            Connection connection =baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setInt(3,product.getQuantity());
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setString(5,product.getDescribtion());
            preparedStatement.setInt(6,product.getCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student selectProductById(int id) {
        String query = "select * from product where id = ?;";
        Student student = null;
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int ids = rs.getInt("student_id");
                String name = rs.getString("student_name");
                String gender = rs.getString("student_gender");
                String email = rs.getString("student_email");
                String phone =rs.getString("student_phone");
                String birthday = rs.getString("student_birthday");
                String address = rs.getString("student_address");
                student = new Student(ids,name,gender,email,phone,birthday,address);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void updateStudent(int id, Student student) {
        String query= "update student\n" +
                "set student_name = ?,\n" +
                "student_gender=?,\n" +
                "student_email =?,\n" +
                "student_phone =?,\n" +
                "student_birthday =?,\n" +
                "student_address=?\n" +
                "where student_id = ?;";
        try{
            Connection connection =baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,student.getStudentName());
            preparedStatement.setString(2,student.getStudentGender());
            preparedStatement.setString(3,student.getStudentEmail());
            preparedStatement.setString(4,student.getStudentPhone());
            preparedStatement.setString(5,student.getStudentBirthday());
            preparedStatement.setString(6,student.getStudentAddress());
            preparedStatement.setInt(7,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Category> seclectAllCategory() {
        String query = "select * from category;";
        List<Category> categoryList = new ArrayList<>();
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                categoryList.add(new Category(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}
