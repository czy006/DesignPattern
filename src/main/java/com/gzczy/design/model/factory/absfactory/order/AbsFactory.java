package com.gzczy.design.model.factory.absfactory.order;

import com.gzczy.design.model.factory.absfactory.pizza.Pizza;

/**
 * @Description 抽象工厂类
 * @Author chenzhengyu
 * @Date 2020-11-13 22:07
 */
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    Pizza createPizza(String orderType);
}
