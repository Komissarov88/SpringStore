package com.komissarov.spring.store.app.repository;

import com.komissarov.spring.store.common.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findAllByCostBetween(double min, double max);
}
