package com.sidu.controller;

import com.google.gson.Gson;
import com.sidu.entity.User;
import com.sidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
@PropertySource(value = {"classpath:config.properties"}, ignoreResourceNotFound = true)
public class UserContoller {

    @Value("${test.content}")
    String test;

//    @Autowired
//    RabbitTemplate rabbitTemplate;

    @Autowired
    UserService userService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(@RequestParam("para") String para){
        User user = new User();
        user.setUsername("zhouya");
        user.setPassword("123");
        user.setPhone("1234567");
        userService.add(user);
        return user.getId()+ "";
    }


    @CachePut(value = "zhy", key = "#name")
    @RequestMapping("set")
    public String setUser(@RequestParam("name") String name){
        return "set " + name;
    }

    @RequestMapping("get")
    public String getUser(){
        List<User> users = userService.getUsers();
        return new Gson().toJson(users);
    }

//    @RequestMapping("sent")
//    public String sentMq(){
//        User user = new User();
//        user.setUsername("zhouya");
//
//        rabbitTemplate.convertAndSend("zyKey", user);
//        return "sent successful";
//    }

}
