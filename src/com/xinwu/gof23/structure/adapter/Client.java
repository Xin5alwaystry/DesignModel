package com.xinwu.gof23.structure.adapter;

/**
 * 结构型设计模式之--适配器模式
 * 三要素：目标接口，适配器adapter，被适配的对象adaptee
 * 可以对应比喻为：充电接口，充电头转换器，充电器
 * 经典的适配器模式：java IO api的实现
 */
public class Client {
    public static void main(String[] args) {
        AdapterByCombination adapterByCombination = new AdapterByCombination(new Charger());
        adapterByCombination.charge();

        AdapterByExtends adapterByExtends = new AdapterByExtends();
        adapterByExtends.charge();
    }
}
