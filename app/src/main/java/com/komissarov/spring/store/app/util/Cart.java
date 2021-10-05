package com.komissarov.spring.store.app.util;

import com.komissarov.spring.store.common.entity.Product;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Cart {
    Map<Product, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }
}
