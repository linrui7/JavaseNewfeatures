package com.github7;
/*
   Author:linrui
   Date:2019/5/17
   Content:枚举
   作用：限制本类实例化对象的产生个数
   可以实现接口，枚举中的对象都是接口对象
*/

public class JavaNewFeatures01 {
    public static void main(String[] args) {
        String sex=Sex.man.type;
        System.out.println(sex);
        String sex1=Sex.woman.type1;
        System.out.println(sex1);
        Sex sex2=Sex.noSex;
        System.out.println(sex2);
        Person person=new Person();
        System.out.println(person);
    }
}
interface ISex{
    void print();
}
enum Sex implements ISex{
    //定义多个内容时，枚举对象必须写在第一行
    man("男"),woman("女","女"),noSex;
    String type=null;
    String type1=null;
    Sex(){}
    Sex(String type ){
        this.type = type;
    }
    Sex(String type,String type1) {
        this.type = type;
        this.type1=type1;
    }

    @Override
    public void print() {
        System.out.println(this.type);
    }
}
class Person {
    String name = "张三";
    int age = 20;
    Sex sex=Sex.man;
    @Override
    public String  toString(){
        return "姓名："+name+"  年龄："+age+"  性别："+sex ;
    }

}