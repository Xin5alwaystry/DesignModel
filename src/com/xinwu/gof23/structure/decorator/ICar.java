package com.xinwu.gof23.structure.decorator;
//抽象构件
public interface ICar {
    void run();
}
//真实对象，或者说是被装饰的对象
class Car implements ICar {
    @Override
    public void run() {
        System.out.println("a car is running on the road!");
    }
}

class CarDecorator implements ICar {
    protected ICar car;

    public CarDecorator() {
    }

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void run() {
        this.car.run();
    }
}

class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator() {
    }

    public FlyCarDecorator(ICar car) {
        super(car);
    }

    private void prepareFly() {
        System.out.println("preparing for flying...");
    }

    private void fly() {
        System.out.println("flying right now...");
    }

    @Override
    public void run() {
        prepareFly();
        super.run();
        fly();
    }
}

class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator() {
    }

    public SwimCarDecorator(ICar car) {
        super(car);
    }

    private void prepareSwim() {
        System.out.println("preparing for swimming...");
    }

    private void swim() {
        System.out.println("swimming right now...");
    }

    @Override
    public void run() {
        prepareSwim();
        super.run();
        swim();
    }
}
