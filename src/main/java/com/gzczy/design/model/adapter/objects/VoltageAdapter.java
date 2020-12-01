package com.gzczy.design.model.adapter.objects;

/**
 * @Description 电源适配器
 * @Author chenzhengyu
 * @Date 2020-12-01 16:38
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int elc5v() {
        int elc220v = voltage220V.elc220v();
        System.out.println("转换电源伏数中....");
        int elc5v = elc220v / 44;
        return elc5v;
    }


}
