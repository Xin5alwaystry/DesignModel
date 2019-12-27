package com.xinwu.gof23.construct.singleton;

/**
 * 创建型设计模式之--单例模式（懒汉式）
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;  //在类加载时不创建对象，而是在使用时创建。

    private SingletonDemo2() {
    }

    //并发效率较低，可以lazy load，比较节约资源。
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
