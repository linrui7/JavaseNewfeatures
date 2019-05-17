package com.github7;
/*
   Author:linrui
   Date:2019/5/17
   Content:接口定义增强
   通常情况下，接口中的方法都是抽象方法，需要实现接口来进行调用
   而Jdk1.8后，可以使用用default来定义普通方法，需要通过对象调用。可以使用static来定义静态方法，通过接口名就可以调用
*/

import javax.swing.*;

public class InterFaceAdd {
    public static void main(String[] args) {
        Mes mes=new Mes();
        //当前并没有实现print1()方法
        mes.print1();
        IMessage iMessage=IMessage.print3();
    }
}
interface IMessage{
    void print();
     default void print1(){
         System.out.println("interface中 通过添加default的方法");
         System.out.println("通过对象调用");
     }
     static IMessage print3(){
         System.out.println("interface中 通过添加static的方法");
         System.out.println("可以直接由接口名称直接调用");
         return new IMessage() {
             @Override
             public void print() { }
             @Override
             public void print1() {}
         };
     }
}

class Mes implements IMessage{
    @Override
    public void print() {

    }
}