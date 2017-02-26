package com.sidu.service.Impl;

import com.sidu.dao.UserMapper;
import com.sidu.entity.User;
import com.sidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junjun on 2017/2/26.
 */
@Service
@Transactional
public class UserServiceImple implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User add(User user) {
        userMapper.save(user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return this.toList(userMapper.findAll());
    }


    private <E> List<E> toList(Iterable<E> i) {
        List<E> list = new ArrayList<>();
        i.forEach(list::add);
        return list;
    }
}
