package com.xinwu.gof23.structure.adapter;

/**
 * 通过组合的方式实现适配器
 */
public class AdapterByCombination implements ChargerInterface {
    private Charger charger;

    public AdapterByCombination(Charger charger) {
        this.charger = charger;
    }

    public AdapterByCombination() {
    }

    @Override
    public void charge() {
        this.charger.charge();
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }
}
