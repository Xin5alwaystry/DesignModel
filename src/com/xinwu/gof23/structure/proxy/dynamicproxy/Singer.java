package com.xinwu.gof23.structure.proxy.dynamicproxy;

public class Singer implements SingInterface {
    @Override
    public void sing() {
        System.out.println("real singer are singing...");
    }
}
