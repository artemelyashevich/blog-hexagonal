package com.elyashevich.blog.application.usecase;

import com.elyashevich.blog.core.domain.Comment;

import java.util.List;

public interface CommentUseCase {

    List<Comment> findAll();

    Comment findById(String id);

    Comment create(Comment comment);

    Comment update(String id, Comment comment);

    void deleteById(String id);
}
