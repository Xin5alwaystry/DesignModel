package com.xinwu.gof23.construct.factory.factorymethod;

import com.xinwu.gof23.construct.factory.Car;

/**
 * 工厂方法模式，符合"对修改关闭，对拓展开放"原则，但是也更复杂；
 * 因此，与静态工厂比较，静态工厂使用的场景更多
 */
public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car benz = new BenzFactory().createCar();

        audi.run();
        benz.run();
    }
}
