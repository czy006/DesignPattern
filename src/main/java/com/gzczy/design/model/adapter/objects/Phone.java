package com.gzczy.design.model.adapter.objects;

/**
 * @Description 手机
 * @Author chenzhengyu
 * @Date 2020-12-01 16:38
 */
public class Phone{

    public void charging(Voltage5V voltage5V){
        if (voltage5V.elc5v() == 5){
            System.out.println("charging start ... ");
            return;
        }
        throw new RuntimeException("It is not 5V, boom! ....");
    }
}
