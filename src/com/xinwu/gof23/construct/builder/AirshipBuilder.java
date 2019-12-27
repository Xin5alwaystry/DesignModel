package com.xinwu.gof23.construct.builder;

public interface AirshipBuilder {
    Rocket createRocket();

    Stopper createStopper();

    Capsule createCapsule();
}
