package com.xinwu.gof23.construct.factory.abstractfactory;

public interface CarFactory {
    Tyre createTyre();
    Engine createEngine();
}
