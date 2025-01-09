package com.elyashevich.blog.application.dao;

import com.elyashevich.blog.core.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostDao {

    List<Post> findAll();

    Optional<Post> findById(String id);

    List<Post> findAllByUserId(String userId);

    Post create(Post post);

    Post update(String id, Post post);

    void delete(String id);
}
