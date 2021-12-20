package com.example.users.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author QZY
 * @date 2021/12/15 10:51
 */
@Data
public class User {
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
