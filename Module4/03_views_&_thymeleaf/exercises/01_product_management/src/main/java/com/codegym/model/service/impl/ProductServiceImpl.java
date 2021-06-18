package com.codegym.model.service.impl;

import com.codegym.model.bean.Product;
import com.codegym.model.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements IProductService {
    private static final Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"ip X",1500,"new","apple"));
        products.put(2,new Product(2,"s10+",1400,"new","samsung"));
        products.put(3,new Product(3,"mi 6 pro",1000,"new","xiaomi"));
        products.put(4,new Product(4,"f1 plus",1200,"new","oppo"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
