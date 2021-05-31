package com.komissarov.springstore.service;

import com.komissarov.springstore.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateService {

    private SessionFactory factory;

    public HibernateService() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        factory.getCurrentSession();
    }

    public Session getSession() {
        return factory.getCurrentSession();
    }
}
