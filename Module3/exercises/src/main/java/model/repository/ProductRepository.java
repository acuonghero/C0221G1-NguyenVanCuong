package model.repository;

import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    BaseRepository baseRepository = new BaseRepository();

    public List<Student> selectAllStudent() {
        String query = "select * from student;";
        List<Student> studentList = new ArrayList<>();

        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("student_id");
                String name = rs.getString("student_name");
                String gender = rs.getString("student_gender");
                String email = rs.getString("student_email");
                String phone =rs.getString("student_phone");
                String birthday = rs.getString("student_birthday");
                String address = rs.getString("student_address");
                studentList.add(new Student(id,name,gender,email,phone,birthday,address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public List<Student> findStudentName(String name) {
        String query = "select * from student where student_name like ?;";
        List<Student> studentList = new ArrayList<>();
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("student_id");
                String names = rs.getString("student_name");
                String gender = rs.getString("student_gender");
                String email = rs.getString("student_email");
                String phone =rs.getString("student_phone");
                String birthday = rs.getString("student_birthday");
                String address = rs.getString("student_address");
                studentList.add(new Student(id,names,gender,email,phone,birthday,address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public boolean deleteStudent(int id) {
        boolean rowDelete = false;
        String query = "delete from student\n" +
                "where student_id = ?;";
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

    public void insertStudent(Student student) {
        String query= "insert into student(student_name,student_email,student_gender,student_phone,student_birthday,student_address)\n" +
                "values(?,?,?,?,?,?);";
        try{
            Connection connection =baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,student.getStudentName());
            preparedStatement.setString(2,student.getStudentEmail());
            preparedStatement.setString(3,student.getStudentGender());
            preparedStatement.setString(4,student.getStudentPhone());
            preparedStatement.setString(5,student.getStudentBirthday());
            preparedStatement.setString(6,student.getStudentAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student selectStudentById(int id) {
        String query = "select * from student where student_id = ?;";
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
}
