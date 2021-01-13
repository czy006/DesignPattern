package com.gzczy.design.model.template;

/**
 * @Description 花生豆浆
 * @Author chenzhengyu
 * @Date 2021-01-13 14:50
 */
public class PeanutSoyMilk extends SoybeanMilk {

    @Override
    void addCondiments() {
        System.out.println(" 加入上好的花生 ");
    }

    @Override
    Boolean isAddCondiments() {
        return true;
    }
}
