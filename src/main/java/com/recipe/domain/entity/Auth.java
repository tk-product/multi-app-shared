package com.recipe.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Auth {
    private Long userId;
    private String email;
    private String username;
    private String password;
    private boolean enabled;
    private List<String> roles;
    private List<String> permissions;
}
