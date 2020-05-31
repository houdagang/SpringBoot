package com.xiaogang.springboot.chapter4.servier.impl;

import com.xiaogang.springboot.chapter4.servier.HelloService;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/30 11:02
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if (name == null || name.trim() == "") {
            throw new RuntimeException("parameter is null");
        }
        System.out.println("hello" + name);
    }
}
