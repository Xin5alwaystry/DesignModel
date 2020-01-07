package com.xinwu.gof23.structure.flyweight;

/**
 * 结构型设计模式之--享元模式（flyweight pattern）
 * 核心：
 * - 该模式以共享的方式高效地支持了大量细粒度对象的重用
 * - 享元对象能做到共享的关键是区分了内部状态和外部状态
 * -- 内部状态：可以共享，不会随环境变化而改变
 * -- 外部状态：不可共享
 *
 * 实现要素：
 * - 享元工厂类：创建并管理享元对象，享元池一般设计成map
 * - 抽象享元类：通常是一个接口或者是抽象类，声明公共方法，这些方法可以向外接提供对象的内部状态，以及设置外部状态
 * - 具体享元类：为内部状态提供的成员变量进行存储
 * - 非共享享元类：不能被共享的子类可以设计成非共享享元类
 */
public class Client {
    public static void main(String[] args) {
        ChessFactory chessFactory = ChessFactory.getInstance();
        ChessFlyWeight white1 = chessFactory.factory("white");
        ChessFlyWeight white2 = chessFactory.factory("white");
        ChessFlyWeight black1 = chessFactory.factory("black");
        ChessFlyWeight black2 = chessFactory.factory("black");

        white1.display(new Coordinate(1,2));
        white2.display(new Coordinate(2,3));
        black1.display(new Coordinate(3,4));
        black2.display(new Coordinate(4,5));

        System.out.println(white1);
        System.out.println(white2);
        System.out.println(black1);
        System.out.println(black2);
    }
}
