package com.github7;
/*
   Author:linrui
   Date:2019/5/17
   Content: 注解（Annotation）
   JDK提供的三个内置注解：@Override、@Deprecated、@SuppressWarnings

  @Override
    方法覆写：继承关系中，子类定义了和父类相同的方法，但是子类访问权限要等于或低于父类
  @Deprecated
    声明过期：表示该方法在新版本可能不支持该方法，不建议使用该方法
  @SuppressWarnings
    "all",	"unchecked", "rawtypes"
    压制警告：当调用了某些操作可能会导致错误，提示出现该警告
    @SuppressWarnings("unchecked")
    告诉编译器忽略 unchecked 警告信息，如使用List，ArrayList等未进行参数化产生的警告信息。
·   @SuppressWarnings("serial")
    如果编译器出现这样的警告信息：The serializable class WmailCalendar does not declare a static final serialVersionUID field of type long
    使用这个注释将警告信息去掉。
·   @SuppressWarnings("deprecation")
    如果使用了使用@Deprecated注释的方法，编译器将出现警告信息。
    使用这个注释将警告信息去掉。
·   @SuppressWarnings("unchecked", "deprecation")
    告诉编译器同时忽略unchecked和deprecation的警告信息。
*/

public class Annotation {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "猫";
        animal.type = "猫科动物";
        System.out.println(animal);
        animal.print();
    }
}

class Animal {
    String name;
    String type;

    @Override
    public String toString() {
        return "这是覆写的toString方法\n " + name + " " + " " + type;
    }

    @Deprecated
    void print() {
        System.out.println("Print()方法,当前方法已经过期");
    }

    void print2() {

    }

}