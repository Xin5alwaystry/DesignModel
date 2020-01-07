package com.xinwu.gof23.structure.flyweight;

public class ConcreteChessFlyWeight implements ChessFlyWeight {

    private String color;

    public ConcreteChessFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println(String.format("color: %s; x: %s; y:%s", color, coordinate.getX(), coordinate.getY()));
    }
}
