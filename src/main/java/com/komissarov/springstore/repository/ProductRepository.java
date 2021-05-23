package com.komissarov.springstore.repository;

import com.komissarov.springstore.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private final List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public Product getById(int id) {
        if (id < 0 || id >= products.size()) {
            throw new IllegalArgumentException();
        }
        return products.get(id);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
