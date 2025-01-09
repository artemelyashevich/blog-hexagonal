package com.elyashevich.blog.application.usecase.impl;

import com.elyashevich.blog.application.usecase.RoleUseCase;
import com.elyashevich.blog.core.domain.Role;

import java.util.List;

public class RoleUseCaseImpl implements RoleUseCase {
    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role findByNane(String name) {
        return null;
    }

    @Override
    public Role create(Role role) {
        return null;
    }

    @Override
    public Role update(String id, Role role) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
