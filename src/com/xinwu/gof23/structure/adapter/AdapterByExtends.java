package com.xinwu.gof23.structure.adapter;

//通过继承的方式实现适配器，比较不灵活。
public class AdapterByExtends extends Charger implements ChargerInterface {
    @Override
    public void charge() {
        super.charge();
    }
}
