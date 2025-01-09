package com.elyashevich.blog.application.usecase.impl;

import com.elyashevich.blog.application.usecase.PostUseCase;
import com.elyashevich.blog.core.domain.Post;

import java.util.List;

public class PostUseCaseImpl implements PostUseCase {
    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public Post findById(String id) {
        return null;
    }

    @Override
    public List<Post> findAllByUserId(String userId) {
        return List.of();
    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public Post update(String id, Post post) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
