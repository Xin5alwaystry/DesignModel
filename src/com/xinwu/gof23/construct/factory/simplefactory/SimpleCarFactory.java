package com.xinwu.gof23.construct.factory.simplefactory;

import com.xinwu.gof23.construct.factory.Audi;
import com.xinwu.gof23.construct.factory.Benz;
import com.xinwu.gof23.construct.factory.Car;

public class SimpleCarFactory {
    public static Car createCar(String name) {
        if ("audi".equalsIgnoreCase(name)) {
            return new Audi();
        } else if ("benz".equalsIgnoreCase(name)) {
            return new Benz();
        } else {
            return null;
        }
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createBenz() {
        return new Benz();
    }
}
