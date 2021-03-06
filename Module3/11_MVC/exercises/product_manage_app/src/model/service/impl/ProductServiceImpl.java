package model.service.impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.service.itf.IProductService;


import java.util.List;

public class ProductServiceImpl implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
      return productRepository.findById(id) ;
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }


    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public  int getMapSize(){
        return productRepository.getMapSize();
    }
}
