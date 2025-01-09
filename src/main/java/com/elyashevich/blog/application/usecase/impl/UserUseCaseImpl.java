package com.elyashevich.blog.application.usecase.impl;

import com.elyashevich.blog.application.usecase.UserUseCase;
import com.elyashevich.blog.core.domain.User;

import java.util.List;

public class UserUseCaseImpl implements UserUseCase {
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(String id, User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
