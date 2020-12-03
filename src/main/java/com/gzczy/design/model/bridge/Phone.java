package com.gzczy.design.model.bridge;

import com.gzczy.design.model.bridge.brand.Brand;

/**
 * @Description 电话类
 * @Author chenzhengyu
 * @Date 2020-12-03 20:07
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        super();
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void call(){
        this.brand.call();
    }

    protected void close(){
        this.brand.close();
    }
}
