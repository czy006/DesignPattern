package com.gzczy.design.model.bridge.type;

import com.gzczy.design.model.bridge.Phone;
import com.gzczy.design.model.bridge.brand.Brand;

/**
 * @Description 直立手机
 * @Author chenzhengyu
 * @Date 2020-12-03 20:08
 */
public class UpRightPhone extends Phone {

    private final String name = "直立手机";

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(name);
    }

    @Override
    public void call() {
        super.call();
        System.out.println(name);
    }

    @Override
    public void close() {
        super.close();
        System.out.println(name);
    }
}
