package com.elyashevich.blog.application.usecase;

import com.elyashevich.blog.core.domain.User;

import java.util.List;

public interface UserUseCase {

    List<User> findAll();

    User findByUsername(String username);

    User findByEmail(String email);

    User findById(String id);

    User create(User user);

    User update(String id, User user);

    void deleteById(Long id);
}
