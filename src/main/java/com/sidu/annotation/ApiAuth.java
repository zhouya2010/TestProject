package com.sidu.annotation;

import java.lang.annotation.*;

/**
 * Created by junjun on 2017/2/6.
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiAuth {
    String desc() default "无描述信息";
    Class clazz() default ApiAuth.class;

}
