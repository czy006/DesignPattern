package com.gzczy.design.model.factory.absfactory.order;

import com.gzczy.design.model.factory.absfactory.pizza.LDCheesePizza;
import com.gzczy.design.model.factory.absfactory.pizza.LDPepperPizza;
import com.gzczy.design.model.factory.absfactory.pizza.Pizza;

/**
 * @Description 伦敦工厂
 * @Author chenzhengyu
 * @Date 2020-11-13 22:09
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
