package com.xiaogang.springboot.chapter3.config;

import com.xiaogang.springboot.chapter3.pojo.ScopeBean;
import com.xiaogang.springboot.chapter3.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.logging.Logger;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/24 20:28
 */
public class IoCTest {

    private static Logger log = Logger.getLogger(String.valueOf(IoCTest.class));

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getUserName());
        User1 user1 = ctx.getBean(User1.class);
        log.info(user1.getUserName());

        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
        System.out.println(scopeBean1 == scopeBean2);
    }

}
