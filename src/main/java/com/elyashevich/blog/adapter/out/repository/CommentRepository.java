package com.elyashevich.blog.adapter.out.repository;

import com.elyashevich.blog.adapter.out.entity.CommentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<CommentEntity, String> {
}
