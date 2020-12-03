package com.gzczy.design.model.bridge.brand;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2020-12-03 20:08
 */
public class XiaoMi implements Brand{

    private static final String name = "xiaomi phone";

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
