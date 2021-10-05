package com.komissarov.spring.store.app.controller;

import com.komissarov.spring.store.app.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CartControllerWs {

    private CartService cartService;

    @Autowired
    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }

    @MessageMapping("/updateCart")
    @SendTo("/topic/getCartProductCount")
    public String updateCartProductCount(){
        return "7";
    }
}
