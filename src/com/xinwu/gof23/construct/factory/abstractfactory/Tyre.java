package com.xinwu.gof23.construct.factory.abstractfactory;

public interface Tyre {
    void resolve();
}

class LowTyre implements Tyre {
    @Override
    public void resolve() {
        System.out.println("低端轮胎");
    }
}

class LuxuryTyre implements Tyre {
    @Override
    public void resolve() {
        System.out.println("高端轮胎");
    }
}