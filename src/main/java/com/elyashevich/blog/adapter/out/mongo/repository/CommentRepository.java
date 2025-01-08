package com.elyashevich.blog.adapter.out.mongo.repository;

import com.elyashevich.blog.adapter.out.mongo.entity.CommentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<CommentEntity, String> {
}
