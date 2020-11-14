package com.gzczy.design.model.factory.normal.order;


import com.gzczy.design.model.factory.normal.pizza.CheesePizza;
import com.gzczy.design.model.factory.normal.pizza.GreekPizza;
import com.gzczy.design.model.factory.normal.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //  订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else {
                System.out.println("程序退出。。。");
                break;
            }
            //输出 pizza 制作过程x
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
