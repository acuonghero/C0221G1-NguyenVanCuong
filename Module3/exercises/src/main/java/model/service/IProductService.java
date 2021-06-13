package model.service;

import model.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    List<Student> selectAllStudent();

    List<Student> findStudentName(String name);

    boolean deleteStudent(int id);

    Map<String,String> validateCreate(Student student);

    void insertStudent(Student student);

    Student selectStudentById(int id);

    Map<String, String> validateUpdate(int id, Student student);
}
