package com.gzczy.design.model.bulider.normal;

/**
 * @Description 普通房子
 * @Author chenzhengyu
 * @Date 2020-11-26 10:48
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }

}
