package com.gzczy.design.model.bulider.normal;

/**
 * @Description 客户端 - 传统方式实现
 * @Author chenzhengyu
 * @Date 2020-11-26 10:50
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }
}
