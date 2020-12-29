package com.gzczy.design.model.flyweight;

/**
 * @Description 用户(对象)
 * @Author chenzhengyu
 * @Date 2020-12-29 16:20
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
