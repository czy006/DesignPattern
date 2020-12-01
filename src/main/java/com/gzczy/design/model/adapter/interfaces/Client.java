package com.gzczy.design.model.adapter.interfaces;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2020-12-01 18:15
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用M1方法");;
            }
        };
        absAdapter.m1();
    }
}
