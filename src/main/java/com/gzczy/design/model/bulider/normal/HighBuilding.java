package com.gzczy.design.model.bulider.normal;


/**
 * @Description 高楼大厦
 * @Author chenzhengyu
 * @Date 2020-11-26 11:03
 */
public class HighBuilding extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("高楼的打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙 20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
    }
}
