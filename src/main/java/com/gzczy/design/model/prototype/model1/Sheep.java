package com.gzczy.design.model.prototype.model1;

/**
 * @Description 克隆绵羊类-浅拷贝演示
 * 使用原型模式改进传统方式，让程序具有更高的效率和扩展性
 * @Author chenzhengyu
 * @Date 2020-11-17 10:08
 */

public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend; //是对象,  克隆是会如何处理,  默认是浅拷贝

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sheep{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", color='").append(color).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", friend=").append(friend);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
