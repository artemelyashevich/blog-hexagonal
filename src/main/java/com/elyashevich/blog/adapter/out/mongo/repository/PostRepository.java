package com.elyashevich.blog.adapter.out.mongo.repository;

import com.elyashevich.blog.adapter.out.mongo.entity.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostEntity, String> {
}
