package com.elyashevich.blog.adapter.out.mongo.repository;

import com.elyashevich.blog.adapter.out.mongo.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
