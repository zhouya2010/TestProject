package com.sidu.controller;

import com.sidu.annotation.ApiAuth;
import com.sidu.domain.Station;
import com.sidu.domain.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by junjun on 2017/2/6.
 */
@Component
@Aspect
public class AopHandle {

    @Pointcut(value = "execution(* com.sidu.controller..*(..))")
    public void point(){

    }



    @Around("@annotation(apiAuth)")
    public void around(ApiAuth apiAuth){
        System.out.println("around");
        System.out.println(apiAuth.desc());
        if (UserContoller.class.equals(apiAuth.clazz())){
            System.out.println("su =====>");
        }

        if (Station.class.equals(apiAuth.clazz())){
            System.out.println("eeee =====>");
        }
    }

    @After("@annotation(com.sidu.annotation.ApiAuth)")
    public void after(JoinPoint joinPoint){
        System.out.println("after");
    }

}
