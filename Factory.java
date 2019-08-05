package com.github7;

/*
   Author:linrui
   Date:2019/8/5
   Content:
   传统工厂模式增加新对象就需要在类中修改工厂类

*/
interface IProductCar {
    void getCar();
}

class Benchi implements IProductCar {
    @Override
    public void getCar() {
        System.out.println("生产中----");
    }
}

class Baoma implements IProductCar {
    @Override
    public void getCar() {
        System.out.println("生产中");

    }
}

//传统工厂
class allFactory {

    private allFactory() {
    }

    public allFactory(String name) {
        if (name.equals("benchi")) {
            new Benchi();
        } else if (name.equals("baoma")) {
            new Baoma();
        } else {
            return;
        }
    }
}

//反射工厂。通过反射对象就不需要在添加
// if(name.equals("baoma")){
//            new Baoma();
class Reflect {
    private Reflect() {
    }

    public static IProductCar getInstance(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IProductCar iProductCar = null;
        //获取反射对象
        iProductCar = (IProductCar) Class.forName(classname).newInstance();
        return iProductCar;
    }
}

public class Factory {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IProductCar newcar=Reflect.getInstance("baoma");
        newcar.getCar();
    }
}
