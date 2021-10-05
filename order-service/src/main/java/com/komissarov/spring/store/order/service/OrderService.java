package com.komissarov.spring.store.order.service;

import com.komissarov.spring.store.common.entity.ShopOrder;
import com.komissarov.spring.store.app.util.Cart;

import java.util.List;

public interface OrderService {

    List<ShopOrder> getUserOrders();
    void saveOrder(Cart cart);
    void deleteOrder(long id);
}
