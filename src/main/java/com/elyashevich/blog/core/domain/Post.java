package com.elyashevich.blog.core.domain;

import com.elyashevich.blog.adapter.out.entity.CommentEntity;
import com.elyashevich.blog.adapter.out.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Builder
@ToString
public class Post {

    private String id;

    private String title;

    private String content;

    private UserEntity creator;

    private Integer rating;

    private Set<CommentEntity> comments;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
