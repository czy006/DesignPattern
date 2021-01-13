package com.gzczy.design.model.template;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2021-01-13 14:30
 */
public class Client {

    public static void main(String[] args) {
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        System.out.println("================");
        PeanutSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        System.out.println("================");
        SoyMilk soyMilk = new SoyMilk();
        soyMilk.make();
    }

}
