package com.elyashevich.blog.application.dao;

import com.elyashevich.blog.core.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<User> findAll();

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);

    User create(User user);

    User update(String id, User user);

    void deleteById(Long id);
}
