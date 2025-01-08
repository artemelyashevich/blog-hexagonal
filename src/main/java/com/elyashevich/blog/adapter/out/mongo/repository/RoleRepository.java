package com.elyashevich.blog.adapter.out.mongo.repository;

import com.elyashevich.blog.adapter.out.mongo.entity.RoleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<RoleEntity, String> {
}
