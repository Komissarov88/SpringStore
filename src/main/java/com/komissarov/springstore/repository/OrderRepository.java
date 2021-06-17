package com.komissarov.springstore.repository;

import com.komissarov.springstore.entity.ShopOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<ShopOrder, Long> {

    List<ShopOrder> findAllByUserId(long userId);
}
