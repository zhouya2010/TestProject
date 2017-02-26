package com.sidu.dao;

import com.sidu.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserMapper extends CrudRepository<User, Long> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}