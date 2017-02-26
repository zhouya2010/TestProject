package com.sidu.service;

import com.sidu.entity.User;

import java.util.List;

/**
 * Created by junjun on 2017/2/26.
 */
public interface UserService {
    User add(User user);
    List<User> getUsers();
}
