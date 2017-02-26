package com.sidu.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Created by dell on 2017/1/6.
 */
@Configuration
@ComponentScan(
        basePackages = {"com.sidu.config.other","com.sidu.entity", "com.sidu.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
public class RootConfig {

}
