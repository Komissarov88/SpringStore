package com.komissarov.spring.store.app.service.impl;

import com.komissarov.spring.store.app.entity.OrderItem;
import com.komissarov.spring.store.app.entity.ShopOrder;
import com.komissarov.spring.store.app.repository.OrderItemRepository;
import com.komissarov.spring.store.app.repository.OrderRepository;
import com.komissarov.spring.store.app.service.OrderService;
import com.komissarov.spring.store.app.service.UserService;
import com.komissarov.spring.store.app.util.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private OrderItemRepository orderItemRepository;
    private UserService userService;

    @Autowired
    public void setOrderItemRepository(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<ShopOrder> getUserOrders() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return orderRepository.findAllByUserId(userService.findUserByLogin(userDetails.getUsername()).getId());
    }

    @Override
    public void saveOrder(Cart cart) {
        ShopOrder order = new ShopOrder();
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        order.setUserId(userService.findUserByLogin(userDetails.getUsername()).getId());
        orderRepository.save(order);
        saveCart(order, cart);
    }

    private void saveCart(ShopOrder order, Cart cart) {
        cart.getItems().forEach((k,v) -> orderItemRepository.save(new OrderItem(order.getId(), k.getId(), v)));
    }

    @Override
    public void deleteOrder(long id) {

    }
}
