package com.xinwu.gof23.structure.bridge;

public interface Brand {
    void sale();
}

class Lenove implements Brand {
    @Override
    public void sale() {
        System.out.println("sale lenovo computer");
    }
}

class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("sale dell computer");
    }
}