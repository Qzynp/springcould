package com.example.users.mapper;

import com.example.users.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author QZY
 * @date 2021/12/15 10:51
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
