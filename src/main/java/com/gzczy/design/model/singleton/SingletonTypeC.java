package com.gzczy.design.model.singleton;


import java.util.HashSet;
import java.util.Set;

/**
 * @Description 单例模式-懒汉式-线程不安全
 * @Author chenzhengyu
 * @Date 2020-11-12 20:50
 */
public class SingletonTypeC {

    public static class ThreadSafeTest implements Runnable {

        public Set<SingletonTypeC> singles = new HashSet<SingletonTypeC>();

        @Override
        public void run() {
            //获取单例
            SingletonTypeC s = SingletonTypeC.getInstance();
            //添加单例
            singles.add(s);
        }
    }

    public static void main(String[] args) {
        //单线程不存在问题

        //HungryTypeC hungryTypeB1 = HungryTypeC.getInstance();
        //HungryTypeC hungryTypeB2 = HungryTypeC.getInstance();
        //System.out.println(hungryTypeB1==hungryTypeB2);

        //测试多线程下出现的问题
        ThreadSafeTest t = new ThreadSafeTest();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        System.out.println(t.singles);
    }

    private static SingletonTypeC HUNGRY_TYPE_C;

    //当这里产生了多个对象就会存在问题，不是一个对象了
    private SingletonTypeC() {
        System.out.println("这是在构造方法中的一句话，用来验证产生了几个对象");
    }

    public static SingletonTypeC getInstance() {
        if (HUNGRY_TYPE_C == null) {
            HUNGRY_TYPE_C = new SingletonTypeC();
        }
        return HUNGRY_TYPE_C;
    }
}
