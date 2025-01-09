package com.elyashevich.blog.adapter.out.repository;

import com.elyashevich.blog.adapter.out.entity.RoleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<RoleEntity, String> {
}
