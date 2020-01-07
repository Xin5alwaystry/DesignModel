package com.xinwu.gof23.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SingHandler implements InvocationHandler {
    private Singer singer;

    public SingHandler(Singer singer) {
        this.singer = singer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy do sth before singer singing...");
        method.invoke(singer, args);
        System.out.println("dynamic proxy do sth after singer singing");
        return null;
    }
}
