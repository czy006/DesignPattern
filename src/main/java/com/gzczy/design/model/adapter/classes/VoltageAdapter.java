package com.gzczy.design.model.adapter.classes;

/**
 * @Description 电源适配器
 * @Author chenzhengyu
 * @Date 2020-12-01 16:38
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int elc5v() {
        int elc220v = elc220v();
        System.out.println("转换电源伏数中....");
        int elc5v = elc220v / 44;
        return elc5v;
    }
}
