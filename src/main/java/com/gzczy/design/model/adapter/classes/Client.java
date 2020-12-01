package com.gzczy.design.model.adapter.classes;

/**
 * @Description 客户端 适配器模式演示
 * @Author chenzhengyu
 * @Date 2020-12-01 16:38
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
