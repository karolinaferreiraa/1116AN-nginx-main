package com.example.gateway_service.domain.user.vo;


public enum RoleType {
    CUSTOMER(1),
    CHEF(2),
    ADMIN(3);

    private final int level;

    RoleType(int level) {
        this.level = level;
    }
}

