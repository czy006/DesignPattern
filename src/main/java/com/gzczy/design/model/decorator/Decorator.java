package com.gzczy.design.model.decorator;

/**
 * @Description 装饰者模式 装饰器
 * @Author chenzhengyu
 * @Date 2020-12-10 09：01
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes();
    }

}
