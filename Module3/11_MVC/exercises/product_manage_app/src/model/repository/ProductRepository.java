package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Iphone1", "new", "800", "Apple"));
        productMap.put(2, new Product(2, "sumsung1", "sch", "800", "Samsung"));
        productMap.put(3, new Product(3, "oppo1", "old", "800", "Oppo"));
        productMap.put(4, new Product(4, "xiaomi1", "new", "800", "Xiaomi"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }


    public void save(Product product) {
        productMap.put(product.getId(), product);
    }


    public Product findById(int id) {
        return productMap.get(id);
    }

    public void update(int id, Product product) {
        productMap.put(id, product);
    }


    public void remove(int id) {
        productMap.remove(id);
    }


    public int getMapSize() {
        return productMap.size();
    }
}
