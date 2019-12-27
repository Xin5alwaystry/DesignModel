package com.xinwu.gof23.construct.factory.abstractfactory;

public interface Engine {
    void run();
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("低端发动机");
    }
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("高端发动机");
    }
}