package com.xinwu.gof23.construct.factory.nofactory;

import com.xinwu.gof23.construct.factory.Audi;
import com.xinwu.gof23.construct.factory.Benz;
import com.xinwu.gof23.construct.factory.Car;

/**
 * 不使用工厂模式，调用者依赖了接口和具体类。
 */
public class Client {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car benz = new Benz();

        audi.run();
        benz.run();
    }
}
