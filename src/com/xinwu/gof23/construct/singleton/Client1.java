package com.xinwu.gof23.construct.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 防止反射和反序列化来破解单例模式
 */
public class Client1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        SingletonDemo1 demo1 = SingletonDemo1.getInstance();
        SingletonDemo1 demo2 = SingletonDemo1.getInstance();

        System.out.println(demo1);
        System.out.println(demo2);

        //利用反射破解，防止该破解的方法是在构造方法中添加逻辑
        /*Class<SingletonDemo1> clazz = (Class<SingletonDemo1>) Class.forName("com.xinwu.gof23.construct.singleton.SingletonDemo1");
        Constructor<SingletonDemo1> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);  //关闭安全检查
        SingletonDemo1 demo3 = constructor.newInstance(null);
        System.out.println(demo3);*/

        //利用序列化破解，可以通过创建readResolve方法来破解
        FileOutputStream fos = new FileOutputStream("/Users/xin5/Desktop/testdir/text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(demo1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/xin5/Desktop/testdir/text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemo1 demo3 = (SingletonDemo1) ois.readObject();
        System.out.println(demo3);

    }
}
