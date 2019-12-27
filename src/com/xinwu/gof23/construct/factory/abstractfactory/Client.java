package com.xinwu.gof23.construct.factory.abstractfactory;

/**
 * 抽象工厂：不可以单独添加产品，可以添加产品族
 */
public class Client {
    public static void main(String[] args) {
        CarFactory lowCarFactory = new LowCarFactory();
        Tyre lowType = lowCarFactory.createTyre();
        Engine lowEngine = lowCarFactory.createEngine();
        lowType.resolve();
        lowEngine.run();
    }
}
