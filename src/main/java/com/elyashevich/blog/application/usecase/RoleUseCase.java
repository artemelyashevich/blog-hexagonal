package com.elyashevich.blog.application.usecase;

import com.elyashevich.blog.core.domain.Role;

import java.util.List;

public interface RoleUseCase {

    List<Role> findAll();

    Role findByNane(String name);

    Role create(Role role);

    Role update(String id, Role role);

    void delete(String id);
}
