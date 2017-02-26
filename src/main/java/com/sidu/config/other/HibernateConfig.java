package com.sidu.config.other;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.SharedCacheMode;
import javax.persistence.ValidationMode;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by junjun on 2017/2/26.
 */

@Configuration
//事务
@EnableTransactionManagement(
        mode = AdviceMode.PROXY, proxyTargetClass = false,
        order = Ordered.LOWEST_PRECEDENCE
)
@EnableJpaRepositories(
        basePackages = "com.sidu.dao",
        entityManagerFactoryRef = "entityManagerFactoryBean",
        transactionManagerRef = "jpaTransactionManager"
)
@PropertySource({"classpath:config.properties"})
public class HibernateConfig {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    private static final Logger log = LogManager.getLogger(HibernateConfig.class);
    private static final Logger schedulingLogger =
            LogManager.getLogger(log.getName() + ".[scheduling]");

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
    {
        Map<String, Object> properties = new Hashtable<>();
        properties.put("javax.persistence.schema-generation.database.action",
                "none");

        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(adapter);
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("com.sidu.entity");
        factory.setSharedCacheMode(SharedCacheMode.ENABLE_SELECTIVE);
        factory.setValidationMode(ValidationMode.NONE);
        factory.setJpaPropertyMap(properties);
        return factory;
    }



    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setInitialSize(5);
        ds.setMaxActive(20);
        return ds;
    }

    @Bean
    public PlatformTransactionManager jpaTransactionManager()
    {
        return new JpaTransactionManager(
                this.entityManagerFactoryBean().getObject()
        );
    }

//    @Bean
//    public ThreadPoolTaskScheduler taskScheduler()
//    {
//        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//        scheduler.setPoolSize(20);
//        scheduler.setThreadNamePrefix("task-");
//        scheduler.setAwaitTerminationSeconds(60);
//        scheduler.setWaitForTasksToCompleteOnShutdown(true);
//        scheduler.setErrorHandler(t -> schedulingLogger.error(
//                "Unknown error occurred while executing task.", t
//        ));
//        scheduler.setRejectedExecutionHandler(
//                (r, e) -> schedulingLogger.error(
//                        "Execution of task {} was rejected for unknown reasons.", r
//                )
//        );
//        return scheduler;
//    }

//    @Override
//    public Executor getAsyncExecutor()
//    {
//        Executor executor = this.taskScheduler();
//        log.info("Configuring asynchronous method executor {}.", executor);
//        return executor;
//    }
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar registrar)
//    {
//        TaskScheduler scheduler = this.taskScheduler();
//        log.info("Configuring scheduled method executor {}.", scheduler);
//        registrar.setTaskScheduler(scheduler);
//    }
}