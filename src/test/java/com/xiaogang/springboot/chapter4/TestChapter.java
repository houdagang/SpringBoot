package com.xiaogang.springboot.chapter4;


import com.xiaogang.springboot.chapter4.intercept.MyInterceptor;
import com.xiaogang.springboot.chapter4.pojo.ProxyBean;
import com.xiaogang.springboot.chapter4.servier.HelloService;
import com.xiaogang.springboot.chapter4.servier.impl.HelloServiceImpl;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/31 11:17
 */
public class TestChapter {

    private static void testProxy() {
        HelloService helloService = new HelloServiceImpl();
        //按约定获取proxy
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("张三");
        System.out.println("\n########name is null!!!#########\n");
        proxy.sayHello(null);
    }

    public static void main(String[] args) {
        new TestChapter().testProxy();
    }

}
