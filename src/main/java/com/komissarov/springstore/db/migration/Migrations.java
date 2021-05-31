package com.komissarov.springstore.db.migration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class Migrations {

    @Autowired
    public Migrations(@Value("${db.url}") String url,
                      @Value("${db.user}") String user,
                      @Value("${db.password}") String password) {

        Flyway flyway = Flyway.configure()
                .mixed(true)
                .dataSource(url, user, password).load();
        flyway.migrate();
    }
}
