package com.komissarov.spring.store.app.service;

import com.komissarov.spring.store.app.entity.ShopOrder;
import com.komissarov.spring.store.app.util.Cart;

import java.util.List;

public interface OrderService {

    List<ShopOrder> getUserOrders();
    void saveOrder(Cart cart);
    void deleteOrder(long id);
}
