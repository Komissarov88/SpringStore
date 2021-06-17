package com.komissarov.springstore.service;

import com.komissarov.springstore.entity.Product;

import javax.servlet.http.HttpSession;

public interface CartService {
    void addProduct(HttpSession session, Product product);

    void deleteProduct(HttpSession session, Product product);

    void setProductCount(HttpSession session, Product product, int count);

    void addCartIfAbsent(HttpSession session);

    int getTotalCost(HttpSession session);
}
