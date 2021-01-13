package com.gzczy.design.model.template;

/**
 * @Description 普通的豆浆 什么都不加
 * @Author chenzhengyu
 * @Date 2021-01-13 15:19
 */
public class SoyMilk extends SoybeanMilk{

    @Override
    void addCondiments() {
        // 空实现！ 什么配料都不加
    }
}
