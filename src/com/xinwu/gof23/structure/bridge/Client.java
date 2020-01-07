package com.xinwu.gof23.structure.bridge;

/**
 * 结构型设计模式之--桥接模式
 *
 * 使用场景：有多个维度时
 * 核心：处理多层继承结构，处理多维度变化的场景，将各个维度设计成独立的继承结构，
 * 使各个维度可以独立的扩展，在抽象层建立关联
 *
 * 例子中，computer类和brand类是独立继承树，通过组合的方式将两个维度"桥接"起来。使得扩展更加灵活。
 */
public class Client {
    public static void main(String[] args) {
        Computer lenovoDesktop = new Desktop(new Lenove());
        lenovoDesktop.sale();

        Computer dellPad = new Pad(new Dell());
        dellPad.sale();
    }
}
