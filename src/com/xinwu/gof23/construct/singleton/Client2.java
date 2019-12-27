package com.xinwu.gof23.construct.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 通过多线程测试不同单例实现的效率
 */
public class Client2 {
    public static void main(String[] args) throws InterruptedException {
        int threadNum = 10;
        Long start = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        Object o = SingletonDemo2.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println(String.format("总耗时：%s", end - start));
    }
}
