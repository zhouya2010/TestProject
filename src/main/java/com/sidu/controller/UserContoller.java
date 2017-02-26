package com.sidu.controller;

import com.sidu.annotation.ApiAuth;
import com.sidu.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("user")
@PropertySource(value = {"classpath:config.properties"}, ignoreResourceNotFound = true)
public class UserContoller {

    @Value("${test.content}")
    String test;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @ApiAuth(clazz = UserContoller.class,desc = "#para")
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(@RequestParam("para") String para){
        return para;
    }


    @CachePut(value = "zhy", key = "#name")
    @RequestMapping("set")
    public String setUser(@RequestParam("name") String name){
        return "set " + name;
    }

    @RequestMapping("get")
    public String getUser(){
        return test;
    }

    @RequestMapping("sent")
    public String sentMq(){
        User user = new User();
        user.setUsername("zhouya");
        user.setEmail("zhouya@163.com");

        rabbitTemplate.convertAndSend("zyKey", user);
        return "sent successful";
    }

}
