package com.xinwu.gof23.construct.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }
}
