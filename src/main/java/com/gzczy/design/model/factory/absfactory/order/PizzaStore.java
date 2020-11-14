package com.gzczy.design.model.factory.absfactory.order;

import com.gzczy.design.model.factory.absfactory.pizza.Pizza;

/**
 * @Description pizza店
 * @Author chenzhengyu
 * @Date 2020-11-13 22:15
 */
public class PizzaStore {

    public static void main(String[] args) {

        OrderPizza orderPizza = new OrderPizza(new BJFactory());
        Pizza cheese = orderPizza.absFactory.createPizza("cheese");
    }
}
