package com.gzczy.design.model.proxy.dynamic;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2021-01-06 20:16
 */
public class TeachDao implements ITeachDao {

    @Override
    public void teach() {
        System.out.println("Teaching....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("My name is " + name);
    }
}
