package com.xinwu.gof23.construct.builder;

public class ShenzhouAirshipDirector implements AirshipDirector {
    private AirshipBuilder airshipBuilder;

    public ShenzhouAirshipDirector(AirshipBuilder airshipBuilder) {
        this.airshipBuilder = airshipBuilder;
    }

    @Override
    public Airship directAirship() {
        Rocket rocket = airshipBuilder.createRocket();
        Stopper stopper = airshipBuilder.createStopper();
        Capsule capsule = airshipBuilder.createCapsule();

        Airship airship = new Airship();
        airship.setRocket(rocket);
        airship.setStopper(stopper);
        airship.setCapsule(capsule);

        return airship;
    }
}
