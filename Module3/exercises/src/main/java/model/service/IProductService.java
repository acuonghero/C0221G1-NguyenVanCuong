package model.service;

import model.bean.Category;
import model.bean.Product;
import model.bean.Student;

import java.util.List;
import java.util.Map;

public interface IProductService {
    List<Product> selectAllProduct();

    List<Product> findProductName(String name);

    boolean deleteProduct(int id);

    Map<String,String> validateCreate(Student student);

    void insertProduct(Product product);

    Student selectStudentById(int id);

    List<Category> seclectAllCategory();
}
