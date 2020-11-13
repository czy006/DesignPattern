package com.gzczy.design.model.singleton;

/**
 * @Description 单例模式-枚举类型测试
 * @Author chenzhengyu
 * @Date 2020-11-12 20:47
 */
public class SingletonEnum {

    public static void main(String[] args) {
        SingletonTypeEnum singletonEnum = SingletonTypeEnum.INSTANCE;
        singletonEnum.sayOK();
    }
}
