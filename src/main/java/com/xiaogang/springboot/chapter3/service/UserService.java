package com.xiaogang.springboot.chapter3.service;

import com.xiaogang.springboot.chapter3.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/24 21:45
 */
@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("编号：" + user.getId());
        System.out.println("用户名称：" + user.getId());
        System.out.println("备注：" + user.getId());
    }

}
