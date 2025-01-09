package com.elyashevich.blog.core.domain;

import com.elyashevich.blog.adapter.out.entity.RoleEntity;
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
@ToString(exclude = "password")
public class User {

    private String id;

    private String username;

    private String email;

    private String password;

    private Set<RoleEntity> roles;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
