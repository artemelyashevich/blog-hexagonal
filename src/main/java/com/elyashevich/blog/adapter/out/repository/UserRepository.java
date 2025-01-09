package com.elyashevich.blog.adapter.out.repository;

import com.elyashevich.blog.adapter.out.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
