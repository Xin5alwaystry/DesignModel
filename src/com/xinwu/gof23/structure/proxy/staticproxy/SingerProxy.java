package com.xinwu.gof23.structure.proxy.staticproxy;

public class SingerProxy implements SingInterface {
    private Singer singer;

    @Override
    public void sing() {
        System.out.println("proxy do sth before singer singing...");
        singer.sing();
        System.out.println("proxy do sth after singer singing...");
    }

    public SingerProxy(Singer singer) {
        this.singer = singer;
    }

    public SingerProxy() {
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}
