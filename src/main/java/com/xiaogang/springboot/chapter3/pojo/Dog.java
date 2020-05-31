package com.xiaogang.springboot.chapter3.pojo;

import com.xiaogang.springboot.chapter3.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/25 19:05
 */
@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】是用来看门的");
    }
}
