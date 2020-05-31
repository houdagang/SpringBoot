package com.xiaogang.springboot.chapter3;

import com.xiaogang.springboot.chapter3.config.AppConfig;
import com.xiaogang.springboot.chapter3.pojo.BussinessPerson;
import com.xiaogang.springboot.chapter3.pojo.Driver;
import com.xiaogang.springboot.chapter3.pojo.SpringEl;
import com.xiaogang.springboot.chapter3.pojo.Squirrel;
import com.xiaogang.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/25 19:21
 */
public class Charpter3Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BussinessPerson.class);
        person.service();

        Squirrel squirrel = ctx.getBean(Squirrel.class);
        squirrel.use();

        DataSource d = (DataSource) ctx.getBean("dataSource");
        System.out.println(d);

        SpringEl sp = (SpringEl)ctx.getBean("springEl");

        ctx.close();
    }

}



