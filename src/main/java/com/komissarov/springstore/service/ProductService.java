package com.komissarov.springstore.service;

import com.komissarov.springstore.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.komissarov.springstore.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
