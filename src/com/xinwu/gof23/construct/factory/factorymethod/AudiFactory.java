package com.xinwu.gof23.construct.factory.factorymethod;

import com.xinwu.gof23.construct.factory.Audi;
import com.xinwu.gof23.construct.factory.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
