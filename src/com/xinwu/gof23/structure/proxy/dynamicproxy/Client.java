package com.xinwu.gof23.structure.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 这里利用jdk 自带动态代理生成工具
 */
public class Client {
    public static void main(String[] args) {
        SingHandler singHandler = new SingHandler(new Singer());
        SingInterface singProxy = (SingInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{SingInterface.class}, singHandler);
        singProxy.sing();
    }
}
