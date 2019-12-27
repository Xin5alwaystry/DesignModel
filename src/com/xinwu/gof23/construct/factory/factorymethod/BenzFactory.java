package com.xinwu.gof23.construct.factory.factorymethod;

import com.xinwu.gof23.construct.factory.Benz;
import com.xinwu.gof23.construct.factory.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
