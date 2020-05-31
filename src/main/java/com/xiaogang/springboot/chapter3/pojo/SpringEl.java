package com.xiaogang.springboot.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : springboot
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/30 8:51
 */
@Component
public class SpringEl {

    @Value("#{'字符串'}")
    private String str = null;

    //科学计数法赋值
    @Value("#{9.3E3}")
    private double d;

    //浮点数
    @Value("#{3.14}")
    private float f;

    //必须能访问到这个属性才行，否则报错
    @Value("#{squirrel.name}")
    private String otherBeanProp = null;

    //？是判断属性是否为空
    @Value("#{squirrel.name?.toUpperCase()}")
    private String otherBeanProp1 = null;

    //数学运算
    @Value("#{1 + 2}")
    private int run;

    //试试自身
    @Value("#{springEl.f == 3.14f}")
    private boolean fFlag;

    //字符串比较
    @Value("#{springEl.str eq 'Springboot'}")
    private boolean strFlag;

    //字符串拼接
    @Value("#{springEl.str + '连接字符串'}")
    private String strApp = null;

    //三元运算
    @Value("#{springEl.run > 4 ? '大于' : '小于'}")
    private String resultDesc = null;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public String getOtherBeanProp() {
        return otherBeanProp;
    }

    public void setOtherBeanProp(String otherBeanProp) {
        this.otherBeanProp = otherBeanProp;
    }

    public String getOtherBeanProp1() {
        return otherBeanProp1;
    }

    public void setOtherBeanProp1(String otherBeanProp1) {
        this.otherBeanProp1 = otherBeanProp1;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public boolean isfFlag() {
        return fFlag;
    }

    public void setfFlag(boolean fFlag) {
        this.fFlag = fFlag;
    }

    public boolean isStrFlag() {
        return strFlag;
    }

    public void setStrFlag(boolean strFlag) {
        this.strFlag = strFlag;
    }

    public String getStrApp() {
        return strApp;
    }

    public void setStrApp(String strApp) {
        this.strApp = strApp;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
