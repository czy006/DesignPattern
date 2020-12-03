package com.gzczy.design.model.bridge.brand;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2020-12-03 20:07
 */
public class Vivo implements Brand{

    private static final String name = "vivo phone";

    @Override
    public void open() {
        System.out.println("open " + name);
    }

    @Override
    public void call() {
        System.out.println("call " + name);
    }

    @Override
    public void close() {
        System.out.println("close " + name);
    }
}
