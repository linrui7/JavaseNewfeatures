package com.github7;
/*
   Author:linrui
   Date:2019/8/5
   Content:
   反射，根据对象来取得对象的来源信息。
   核心操作为Object的一个方法getClass（）

*/

import java.util.Date;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取实例化对象
        Class object=Class.forName("java.util.Date");
        System.out.println(object.getName());
        Object newobj=object.newInstance();
        Object o=new Date();
        System.out.println(o);
        System.out.println(newobj);
    }
}
