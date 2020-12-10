package com.gzczy.design.model.decorator;

/**
 * @Description 装饰者模式 抽象类drink
 * @Author chenzhengyu
 * @Date 2020-12-10 09：01
 */
public abstract class Drink {

    public String des;

    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();

}
