package com.xiaogang.springboot.chapter3.life;

import com.xiaogang.springboot.chapter3.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/27 19:26
 */
//@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用" + "postProcessBeforeInitialization方法，参数【"
        + bean.getClass().getSimpleName() + "】【" + beanName + "】");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean , String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用postProcessAfterInitialization 方法,参数 【"
        + bean.getClass().getSimpleName() + "】【" + beanName + "】") ;
        return bean ;
    }

}
