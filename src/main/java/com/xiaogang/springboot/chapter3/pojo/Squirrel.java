package com.xiaogang.springboot.chapter3.pojo;

import com.xiaogang.springboot.chapter3.pojo.definition.Animal;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/29 19:43
 */
public class Squirrel implements Animal {

    @Value("245fagag松鼠")
    public String name = null;

    @Override
    public void use() {
        System.out.println("松鼠可以采集松果");
    }
}
