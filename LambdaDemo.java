package com.github7;
/*
   Author:linrui
   Date:2019/5/20
   Content:Lambda  JDK1.8
   使用Lambda式时，接口必须只有一个方法
   语法： (参数) -> 单行语句 ;
   如果此接口为函数式编程，则最好在前面加上注解@FunctionalInterface
*/

public class LambdaDemo {
    public static void main(String[] args) {
        //实例化方式一
        IBook iBook = new IBook() {
            @Override
            public void print() {
                System.out.println("实现IBOOk的接口，实现其方法");
            }
        };
        //实例化方式2，只有一个方法才能使用Lambda
        IBook iBook1 = () -> {
            System.out.println("直接实现其接口方法");
        };
        iBook.print();
        iBook1.print();

        //实例化IAdd对象
        IAdd iAdd = new IAdd() {
            @Override
            public int add(int a, int b) {
                int sum = a + b;
                return sum;
            }
        };
        //lambd实例化
        IAdd iAdd1 = (a, b) -> a+b;

        //输出10+20
        System.out.println(iAdd.add(10, 20));
        System.out.println(iAdd1.add(10, 20));
    }
}

interface IBoo {
    void sound();

    void cook();

    void eat();
}

//此处加了注释，表示这是一个函数式接口，只能定义一个方法
@FunctionalInterface
interface IBook {
    void print();
}

@FunctionalInterface
interface IAdd {
    int add(int a, int b);
}


