package com.xinwu.gof23.construct.singleton;

/**
 * 创建型设计模式之--单例模式（枚举类）
 */
public enum SingletonDemo5 {
    //枚举本身就是一个单例，用这种方式实现单例的优点是：线程安全，调用效率高，但不能lazy load
    //天然防止反射和反序列化的漏洞
    INSTANCE;
}
