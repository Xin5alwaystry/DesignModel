package com.xinwu.gof23.construct.singleton;

/**
 * 创建型设计模式之--单例模式（静态内部类）
 */
public class SingletonDemo4 {
    //三大优点，1）线程安全；2）lazy load，内部类在使用时才会加载；3）调用效率高
    //多数开源框架中常用的单例实现方式
    private static class Singleton {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance() {
        return Singleton.instance;
    }
}
