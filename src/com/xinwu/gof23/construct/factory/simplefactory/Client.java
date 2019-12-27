package com.xinwu.gof23.construct.factory.simplefactory;

import com.xinwu.gof23.construct.factory.Car;

/**
 * 通过简单工厂方法创建对象，调用者只需要依赖的简单工厂类和接口即可，依赖的更少。
 * 简单工厂一般也称为静态工厂，因为通常是通过静态方法来创建对象。
 * 但是，如果不修改工厂的代码逻辑，简单工厂将无法创建新的类的实例。
 * 即不满足"对修改关闭，对扩展开放"原则
 */
public class Client {
    public static void main(String[] args) {
        Car audi1 = SimpleCarFactory.createCar("audi");
        Car benz1 = SimpleCarFactory.createCar("benz");

        Car audi2 = SimpleCarFactory.createAudi();
        Car benz2 = SimpleCarFactory.createBenz();

        audi1.run();
        benz1.run();
        audi2.run();
        benz2.run();
    }
}
