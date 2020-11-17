package com.gzczy.design.model.prototype.model3;

import java.io.Serializable;

/**
 * @Description 小鸡类
 * @Author chenzhengyu
 * @Date 2020-11-17 10:51
 */
public class Chicken implements Cloneable, Serializable {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chicken{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
