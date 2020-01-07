package com.xinwu.gof23.structure.decorator;

/**
 * 结构型设计类型之--装饰器模式
 * 指责：
 * - 动态地为一个对象增加新的功能
 * - 该模式是一种用于代替继承的技术（更灵活），无须通过继承增加子类就能扩展对象的新功能，同时避免类型体系的快速膨胀
 * 实现细节：
 * - Component抽象构件角色
 *  真实对象和装饰对象实现共同的接口。这样，客户端对象能够以与真实对象相同的方式同装饰对象交互（面向接口编程）
 * - ConcreteComponent 真实对象
 * - Decorator 装饰对象
 *  持有一个抽象构件的引用。装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象。这样就能在真实对象调用的前后增加新的功能的
 * - ConcreteDecorator
 *  具体的装饰对象
 */
public class Client {
    public static void main(String[] args) {
        ICar car = new Car();
        car.run();

        System.out.println();
        FlyCarDecorator flyCarDecorator = new FlyCarDecorator(car);
        flyCarDecorator.run();

        System.out.println();
        SwimCarDecorator swimCarDecorator = new SwimCarDecorator(flyCarDecorator);
        swimCarDecorator.run();
    }
}
