package com.xinwu.gof23.construct.singleton;

/**
 * 创建型设计模式之--单例模式（双重检测锁 double check locking）
 */
public class SingletonDemo3 {
    private static volatile SingletonDemo3 instance;

    private SingletonDemo3() {
    }

    //懒汉式单例，在每次获取实例的时候，都上锁，影响了并发的效率；
    //而实际上，只需要在第一次创建实例的时候加锁，因此将锁的控制粒度减小。
    //对instance对象用volatile关键字修饰，是为了避免一个线程可能看到了初始化一半的情况
    //针对这种实现方式，需要再加深理解
    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}
