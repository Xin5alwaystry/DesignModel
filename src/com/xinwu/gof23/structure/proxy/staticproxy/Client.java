package com.xinwu.gof23.structure.proxy.staticproxy;

/**
 * 结构性设计模式之--代理模式（**）
 * 可以把代理比做经纪人，它控制了对真正对象访问，并且可以在调用真正对象的方法前后增加一些通用的逻辑，比如方法计时器，日志打印等等。
 * 代理模式三要素：对外提供的接口，代理，以及真实的执行对象
 * 代理模式又分成静态代理和动态代理，它们的区别在与代理是由我们创建，还是由工具动态生成的。
 * 这里先讨论静态代理。
 */
public class Client {
    public static void main(String[] args) {
        Singer singer = new Singer();
        SingerProxy singerProxy = new SingerProxy(singer);
        singerProxy.sing();
    }
}
