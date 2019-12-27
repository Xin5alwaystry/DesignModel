package com.xinwu.gof23.construct.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import sun.misc.JavaObjectInputStreamAccess;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date birthday = new Date(111111L);
        Sheep sheep = new Sheep("喜羊羊", birthday);

        //通过序列化和反序列化的方式进行克隆
        ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.getBytes();

        ByteInputStream bis = new ByteInputStream(bytes, bytes.length);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep2 = (Sheep) ois.readObject();

        sheep.setBirthday(new Date(222222L));

        System.out.println(sheep);
        System.out.println(sheep.getName());
        System.out.println(sheep.getBirthday());

        System.out.println(sheep2);
        System.out.println(sheep2.getName());
        System.out.println(sheep2.getBirthday());
    }
}
