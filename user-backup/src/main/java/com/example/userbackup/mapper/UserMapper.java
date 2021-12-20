package com.example.userbackup.mapper;

import com.example.userbackup.domain.User;
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
