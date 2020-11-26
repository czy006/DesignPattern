package com.gzczy.design.model.bulider.update;

/**
 * @Description 普通房子
 * @Author chenzhengyu
 * @Date 2020-11-26 11:02
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙1米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
