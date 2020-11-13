package com.gzczy.design.model.singleton;

/**
 * @Description 单例模式-饿汉式
 *
 * 通过静态变量去实例化
 * @Author chenzhengyu
 * @Date 2020-11-11 21:56
 */
public class SingletonTypeA {

    public static void main(String[] args) {
        SingletonTypeA singletonTypeA1 = SingletonTypeA.getInstance();
        SingletonTypeA singletonTypeA2 = SingletonTypeA.getInstance();
        System.out.println(singletonTypeA1 == singletonTypeA2);
    }

    //本类内部直接创建实例
    private static final SingletonTypeA HUNGRY_TYPE_A = new SingletonTypeA();

    //构造器私有化，外部不能直接创建
    private SingletonTypeA(){

    }

    //提供一个公有的静态方法，返回实例对象
    public static SingletonTypeA getInstance(){
        return HUNGRY_TYPE_A;
    }
}
