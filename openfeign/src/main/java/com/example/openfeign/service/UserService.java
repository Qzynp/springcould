package com.example.openfeign.service;

import com.example.openfeign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author QZY
 * @date 2021/12/15 10:51
 */
@Component
@FeignClient(value = "USER-SERVICE")
public interface UserService {
    @GetMapping("/users")
    List<User> users();
}
