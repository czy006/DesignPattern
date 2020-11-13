package com.gzczy.design.model.singleton;


/**
 * @Description 单例模式-静态内部类实现
 * @Author chenzhengyu
 * @Date 2020-11-12 20:50
 */
public class SingletonTypeF {

    public static class HungryType {
        public static final SingletonTypeF SINGLETON_TYPE_F = new SingletonTypeF();
    }

    public static void main(String[] args) {
        SingletonTypeF.getInstance();
    }

    public static synchronized SingletonTypeF getInstance(){
        return HungryType.SINGLETON_TYPE_F;
    }

}
