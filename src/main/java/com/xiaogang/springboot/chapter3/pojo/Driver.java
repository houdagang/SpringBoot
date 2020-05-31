package com.xiaogang.springboot.chapter3.pojo;

import com.xiaogang.springboot.chapter3.pojo.definition.Animal;
import com.xiaogang.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/25 21:43
 */
@Component
public class Driver implements Person {

    private Animal animal = null;

    public Driver (@Autowired @Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
