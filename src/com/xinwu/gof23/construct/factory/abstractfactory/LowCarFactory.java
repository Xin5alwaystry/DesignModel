package com.xinwu.gof23.construct.factory.abstractfactory;

public class LowCarFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }
}
