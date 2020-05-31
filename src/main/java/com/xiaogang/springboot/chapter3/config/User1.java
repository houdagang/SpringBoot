package com.xiaogang.springboot.chapter3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/24 20:45
 */
//如果不配置，那么IOC容器会把类名第一个字母小写
@Component("user1")
public class User1 {
    @Value("1")
    private Long id;
    @Value("user1_name_1")
    private String userName;
    @Value("note1_1")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
