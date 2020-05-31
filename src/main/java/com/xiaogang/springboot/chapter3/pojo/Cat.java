package com.xiaogang.springboot.chapter3.pojo;

import com.xiaogang.springboot.chapter3.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/25 19:24
 */
@Component
/**
 * 当发现有多个同样类型的 Bean 时请优先使用我进行注入
 */
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【"+Cat.class.getSimpleName()+"】是抓老鼠的。");
    }
}
