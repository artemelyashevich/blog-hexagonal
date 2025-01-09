package com.elyashevich.blog.application.dao;

import com.elyashevich.blog.core.domain.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentDao {

    List<Comment> findAll();

    Optional<Comment> findById(String id);

    Comment create(Comment comment);

    Comment update(String id, Comment comment);

    void deleteById(String id);
}
