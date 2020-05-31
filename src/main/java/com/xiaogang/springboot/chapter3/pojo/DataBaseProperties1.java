package com.xiaogang.springboot.chapter3.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/27 20:05
 */
@Component
@ConfigurationProperties("database")
public class DataBaseProperties1 {

    private String driverName = null;

    private String url = null;

    private String username = null;

    private String password = null;

    public void setDriverName(String driverName) {
        System.out.println(driverName);
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }
}
