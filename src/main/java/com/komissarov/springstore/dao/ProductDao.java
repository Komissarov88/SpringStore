package com.komissarov.springstore.dao;

import com.komissarov.springstore.entity.Product;
import com.komissarov.springstore.service.HibernateService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDao {

    private HibernateService hibernateService;

    @Autowired
    public void setHibernateService(HibernateService hibernateService) {
        this.hibernateService = hibernateService;
    }

    public Product findById(long id) {
        Session session = hibernateService.getSession();
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.getTransaction().commit();
        return product;
    }

    public List<Product> findAll() {
        Session session = hibernateService.getSession();
        session.beginTransaction();
        List<Product> products = session.createQuery("SELECT p from Product p", Product.class).getResultList();
        session.getTransaction().commit();
        return products;
    }

    public void deleteById(long id) {
        Session session = hibernateService.getSession();
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.delete(product);
        session.getTransaction().commit();
    }

    public void saveOrUpdate(Product product) {
        Session session = hibernateService.getSession();
        session.beginTransaction();
        session.saveOrUpdate(product);
        session.getTransaction().commit();
    }
}
