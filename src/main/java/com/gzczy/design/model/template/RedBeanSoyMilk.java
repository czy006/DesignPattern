package com.gzczy.design.model.template;

/**
 * @Description 红豆豆浆
 * @Author chenzhengyu
 * @Date 2021-01-13 14:43
 */
public class RedBeanSoyMilk extends SoybeanMilk{

    @Override
    void addCondiments() {
        System.out.println(" 加入上好的红豆 ");
    }

    @Override
    Boolean isAddCondiments() {
        return true;
    }
}
