package com.elyashevich.blog.application.usecase;

import com.elyashevich.blog.core.domain.Post;

import java.util.List;

public interface PostUseCase {

    List<Post> findAll();

    Post findById(String id);

    List<Post> findAllByUserId(String userId);

    Post create(Post post);

    Post update(String id, Post post);

    void delete(String id);
}
