package com.gzczy.design.model.factory.simple.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("奶酪披萨 prepare;");
    }

}
