package com.demo.dao;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select count(1) from user")
    int count();

    @Select("select user_name name,description 'desc' from user where id=#{id}")
    User getUser(int id);

}
