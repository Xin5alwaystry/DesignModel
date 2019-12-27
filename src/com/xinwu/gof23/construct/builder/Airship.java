package com.xinwu.gof23.construct.builder;

public class Airship {
    private Rocket rocket;
    private Stopper stopper;
    private Capsule capsule;

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Stopper getStopper() {
        return stopper;
    }

    public void setStopper(Stopper stopper) {
        this.stopper = stopper;
    }

    public Capsule getCapsule() {
        return capsule;
    }

    public void setCapsule(Capsule capsule) {
        this.capsule = capsule;
    }
}

class Rocket {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Stopper {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Capsule {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}