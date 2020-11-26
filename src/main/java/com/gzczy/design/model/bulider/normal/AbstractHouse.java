package com.gzczy.design.model.bulider.normal;

/**
 * @Description 房子建造抽象类
 * @Author chenzhengyu
 * @Date 2020-11-26 10:45
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
