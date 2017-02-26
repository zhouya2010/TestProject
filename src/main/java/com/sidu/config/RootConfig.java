package com.sidu.config;

import com.sidu.config.other.CachingConfig;
import com.sidu.config.other.DataSourceConfig;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Created by dell on 2017/1/6.
 */
@Configuration
//@Import({DataSourceConfig.class,CachingConfig.class})
@ComponentScan(
        basePackages = {"com.sidu.config.other", "com.sidu.dao", "com.sidu.domain", "com.sidu.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
public class RootConfig {

}
