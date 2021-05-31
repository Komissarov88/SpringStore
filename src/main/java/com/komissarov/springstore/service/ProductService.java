package com.komissarov.springstore.service;

import com.komissarov.springstore.dao.ProductDao;
import com.komissarov.springstore.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.komissarov.springstore.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> getProducts() {
        return productDao.findAll();
    }

    public void addProduct(Product product) {
        productDao.saveOrUpdate(product);
    }
}
