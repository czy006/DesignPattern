package com.gzczy.design.model.prototype.model1;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2020-11-17 10:16
 */
public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("原型模式1创建-浅拷贝");
        Sheep sheep = new Sheep("wjr", 23, "black");
        //设置朋友关系
        sheep.friend = new Sheep("czy", 24,"white" );
        //克隆羊
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        //输出查看属性
        System.out.println(sheep1);
        System.out.println(sheep2);
        //对比羊里面朋友属性
        System.out.println(sheep.friend.hashCode());
        System.out.println(sheep1.friend.hashCode());
        System.out.println(sheep2.friend.hashCode());
    }
}
