package com.elyashevich.blog.adapter.out.repository;

import com.elyashevich.blog.adapter.out.entity.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostEntity, String> {
}
