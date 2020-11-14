package com.gzczy.design.model.factory.normal.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("希腊披萨 prepare;");
    }

}
