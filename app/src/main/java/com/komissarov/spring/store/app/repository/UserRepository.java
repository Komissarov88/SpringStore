package com.komissarov.spring.store.app.repository;

import com.komissarov.spring.store.app.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByLogin(String login);
}
