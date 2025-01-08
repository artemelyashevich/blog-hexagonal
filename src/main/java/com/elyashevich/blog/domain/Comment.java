package com.elyashevich.blog.domain;

import com.elyashevich.blog.adapter.out.mongo.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Builder
@ToString
public class Comment {

    private String id;

    private String content;

    private UserEntity creator;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
