package com.gzczy.design.model.singleton;

/**
 * @Description 单例模式-饿汉式-静态代码块
 * @Author chenzhengyu
 * @Date 2020-11-12 18:50
 */
public class SingletonTypeB {

    public static void main(String[] args) {
        SingletonTypeB singletonTypeB1 = SingletonTypeB.getInstance();
        SingletonTypeB singletonTypeB2 = SingletonTypeB.getInstance();
        System.out.println(singletonTypeB1 == singletonTypeB2);
    }

    private static SingletonTypeB HUNGRY_TYPE_B;

    //静态代码块创建单例对象
    static {
        HUNGRY_TYPE_B = new SingletonTypeB();
    }

    private SingletonTypeB(){

    }

    public static SingletonTypeB getInstance(){
        return HUNGRY_TYPE_B;
    }
}
