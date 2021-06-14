package model.service.impl;

import model.bean.Category;
import model.bean.Product;
import model.bean.Student;
import model.repository.ProductRepository;
import model.service.IProductService;

import java.util.List;
import java.util.Map;

public class IProductServiceImpl implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();
    }

    @Override
    public List<Product> findProductName(String name) {
        return null;
    }

//    @Override
//    public List<Product> findProductName(String name) {
//        return productRepository.findStudentName(name) ;
//    }

    @Override
    public boolean deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }

    @Override
    public Map<String, String> validateCreate(Student student) {
        return null;
    }


    @Override
    public void insertProduct(Product product) {
         productRepository.insertProduct(product);
    }

    @Override
    public Student selectStudentById(int id) {
        return productRepository.selectProductById(id);
    }

    @Override
    public List<Category> seclectAllCategory() {
        return productRepository.seclectAllCategory();
    }


    private void updateStudent(int id, Student student) {
        productRepository.updateStudent(id,student);
    }
}
