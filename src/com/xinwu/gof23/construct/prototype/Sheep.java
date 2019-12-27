package com.xinwu.gof23.construct.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Serializable, Cloneable {
    private String name;
    private Date birthday;

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Object自带的克隆方法为浅克隆
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

class Sheep2 implements Serializable, Cloneable {
    private String name;
    private Date birthday;

    public Sheep2() {
    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //手动深克隆，个人感觉这种做法比较low。如果对象中有很多成员变量，难道要一个个手动深克隆？
        //序列化反序列化更为可取
        Sheep2 o = (Sheep2) super.clone();
        Date date = (Date) this.getBirthday().clone();
        o.setBirthday(date);
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}


