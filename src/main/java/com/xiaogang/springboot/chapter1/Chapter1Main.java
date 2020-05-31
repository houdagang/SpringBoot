package com.xiaogang.springboot.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/23 23:12
 */

@Controller
@EnableAutoConfiguration
public class Chapter1Main {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,String> test() {
        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        return map;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Chapter1Main.class,args);
    }

}
