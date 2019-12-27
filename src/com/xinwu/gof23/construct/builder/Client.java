package com.xinwu.gof23.construct.builder;

/**
 * 创建型设计模式之--创建者模式
 */
public class Client {
    public static void main(String[] args) {
        ShenzhouAirshioBuilder shenzhouAirshioBuilder = new ShenzhouAirshioBuilder();
        ShenzhouAirshipDirector shenzhouAirshipDirector = new ShenzhouAirshipDirector(shenzhouAirshioBuilder);
        Airship airship = shenzhouAirshipDirector.directAirship();
        System.out.println(airship);
    }
}
