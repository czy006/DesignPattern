package com.gzczy.design.model.factory.absfactory.order;

import com.gzczy.design.model.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description 订购pizza
 * @Author chenzhengyu
 * @Date 2020-11-13 22:10
 */
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        this.absFactory = absFactory;
        String orderType = ""; //  用户输入
        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            //订购成功
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败，退出程序。。。");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
