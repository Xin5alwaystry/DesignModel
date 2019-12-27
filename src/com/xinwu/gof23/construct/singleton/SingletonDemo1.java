package com.xinwu.gof23.construct.singleton;

import java.io.Serializable;

/**
 * 创建型设计模式之--单例模式（饿汉式）
 */
public class SingletonDemo1 implements Serializable {
    //在类加载时马上创建实例，由于jvm的特性，该过程是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){
        //防止反射漏洞
        if (instance != null) {
            throw new RuntimeException();
        }
    };

    //饿汉式单例模式，由于没有synchronized关键字，因此调用效率更高，但是不能lazy load
    public static SingletonDemo1 getInstance() {
        return instance;
    }

    //防止反序列化漏洞
    private Object readResolve() {
        return instance;
    }
}
