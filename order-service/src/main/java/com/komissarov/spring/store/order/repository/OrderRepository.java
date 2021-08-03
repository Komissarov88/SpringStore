package com.komissarov.spring.store.order.repository;

import com.komissarov.spring.store.common.entity.ShopOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<ShopOrder, Long> {

    List<ShopOrder> findAllByUserId(long userId);
}
