package com.elyashevich.blog.application.usecase.impl;

import com.elyashevich.blog.application.usecase.CommentUseCase;
import com.elyashevich.blog.core.domain.Comment;

import java.util.List;

public class CommentUseCaseImpl implements CommentUseCase {
    @Override
    public List<Comment> findAll() {
        return List.of();
    }

    @Override
    public Comment findById(String id) {
        return null;
    }

    @Override
    public Comment create(Comment comment) {
        return null;
    }

    @Override
    public Comment update(String id, Comment comment) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
