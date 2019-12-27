package com.xinwu.gof23.construct.builder;

public class ShenzhouAirshioBuilder implements AirshipBuilder {
    @Override
    public Rocket createRocket() {
        System.out.println("build shenzhou rocket");
        return new Rocket();
    }

    @Override
    public Stopper createStopper() {
        System.out.println("build shenzhou stopper");
        return new Stopper();
    }

    @Override
    public Capsule createCapsule() {
        System.out.println("build shenzhou capsule");
        return new Capsule();
    }
}
