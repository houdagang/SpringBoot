package com.xiaogang.springboot.chapter3.pojo;

import com.xiaogang.springboot.chapter3.pojo.definition.Animal;
import com.xiaogang.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 : 不带参数的构造方法实现依赖注入
 * @创建日期 : 2020/5/25 19:01
 */
@Component
public class BussinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    /**
     * Autowired规则：
     * 首先根据类型找对应的Bean，如果不唯一，则根据属性名去和Bean的名称进行匹配,
     * 如果匹配的上，就返回该Bean，反之报错。
     * 注：Autowired默认必须找到一个对应Bean的注解。如果不能确定其标注属性，并且
     * 允许这个被标注的属性为null，那么你可以配置@Autowired属性required为false
     */
    private Animal animal = null;

    public BussinessPerson (Animal animal) {
        this.animal = animal ;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName()+ "】调用了BeanFactoryAware的setBeanFactory方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("【" + this.getClass().getSimpleName()+ "】调用了BeanNameAware的setBeanName方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName()+ "】调用了InitializingBean的afterPropertiesSet方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName()+ "】调用了ApplicationContextAware的setApplicationContext方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName()+ "】disposableBean方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("【"+this.getClass().getSimpleName()+"】注解@PostConstruct定义的自定义初始化方法");
    }

    @PreDestroy
    public void destroy1() {
        System.out.println("【" + this.getClass().getSimpleName() + "】注解@PreDestroy方法");
    }
}
