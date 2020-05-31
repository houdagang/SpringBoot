package com.xiaogang.springboot.chapter3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/27 20:11
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaogang.springboot.chapter3"})
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class Chapter3Application {

    public static void main(String [] args) {
        SpringApplication.run(Chapter3Application.class,args);
    }

}
