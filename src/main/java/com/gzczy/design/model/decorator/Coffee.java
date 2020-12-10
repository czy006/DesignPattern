package com.gzczy.design.model.decorator;


/**
 * @Description 装饰者模式
 * @Author chenzhengyu
 * @Date 2020-12-10 09：01
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
