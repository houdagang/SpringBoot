package com.xiaogang.springboot.chapter4.intercept;


import com.xiaogang.springboot.chapter4.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/31 10:46
 */
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before() {
        System.out.println("before......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after......");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before ......");
        Object obj = invocation.proceed();
        System.out.println("around after.....");
        return null;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}
