package com.gzczy.design.model.factory.absfactory.order;

import com.gzczy.design.model.factory.absfactory.pizza.BJCheesePizza;
import com.gzczy.design.model.factory.absfactory.pizza.BJPepperPizza;
import com.gzczy.design.model.factory.absfactory.pizza.Pizza;

/**
 * @Description 北京工厂
 * @Author chenzhengyu
 * @Date 2020-11-13 22:09
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
