package com.komissarov.springstore.service;

import com.komissarov.springstore.entity.Product;
import com.komissarov.springstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(int page) {
        return productRepository.findAll(PageRequest.of(page, 5)).getContent();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
