package com.elyashevich.blog.application.dao;

import com.elyashevich.blog.core.domain.Role;

import java.util.List;
import java.util.Optional;

public interface RoleDao {

    List<Role> findAll();

    Optional<Role> findByNane(String name);

    Role create(Role role);

    Role update(String id, Role role);

    void delete(String id);
}
