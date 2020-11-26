package com.gzczy.design.model.bulider.update;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2020-11-26 11:02
 */
public class Client {
    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        houseDirector.constructHouse();
        houseDirector.setHouseBuilder(new HighBuilding());
        houseDirector.constructHouse();
    }
}
