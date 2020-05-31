package com.xiaogang.springboot.chapter3.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/24 20:17
 */
@Configuration
//默认只扫描当前包和子包下
@ComponentScan(basePackages = "com.xiaogang.springboot.chapter3.*",lazyInit = true,
        excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
@ImportResource(value = {"classpath:spring-other.xml"})
public class AppConfig {

    //如果没有配置，则默认的name是initUser
    /*@Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }*/

    /**
     * Spring将不会启懂 Profile 机制，这就 Profile Bean 将不 Spring 配到 roe 容器 Spring
     * 先判 定是否 spring.profiles.active 置后 再去查 spring.profiles.default 配置 的，所以
     * spring.profiles.active 的优先级 spring profiles.default
     * @return
     */
    @Bean(name = "dataSource")
    //@Profile("dev")
    public DataSource getDataSource() {
        Properties props = new Properties();
        props.setProperty("dirver","com.mysql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/chapter3");
        props.setProperty("username","root");
        props.setProperty("password","952551");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean(name = "dataSource",destroyMethod = "close")
    @Conditional(DatabaseConditional.class)
    //@Profile("test")
    public DataSource getDataSource1(
            @Value("${database.driverName}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password
            ) {
        Properties props = new Properties();
        props.setProperty("dirver",driver);
        props.setProperty("url",url);
        props.setProperty("username",username);
        props.setProperty("password",password);
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }


}
