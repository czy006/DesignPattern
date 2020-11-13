package com.gzczy.design.model.singleton;


import java.util.HashSet;
import java.util.Set;

/**
 * @Description 单例模式-懒汉式-线程安全（低效率）
 * @Author chenzhengyu
 * @Date 2020-11-12 20:50
 */
public class SingletonTypeD {

    public static class ThreadSafeTest implements Runnable {

        public Set<SingletonTypeD> singles = new HashSet<SingletonTypeD>();

        @Override
        public void run() {
            //获取单例
            SingletonTypeD s = SingletonTypeD.getInstance();
            //添加单例
            singles.add(s);
        }
    }


    public static void main(String[] args) {
        //单线程不存在问题

        //HungryTypeC hungryTypeB1 = HungryTypeC.getInstance();
        //HungryTypeC hungryTypeB2 = HungryTypeC.getInstance();
        //System.out.println(hungryTypeB1==hungryTypeB2);

        //测试多线程下也不会出现问题了 因为有锁保证
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

    private static SingletonTypeD HUNGRY_TYPE_D;

    //当这里产生了多个对象就会存在问题，不是一个对象了
    private SingletonTypeD() {
        System.out.println("这是在构造方法中的一句话，用来验证产生了几个对象");
    }

    //思考一下 这种是不是效率会比较低
    public static synchronized SingletonTypeD getInstance() {
        if (HUNGRY_TYPE_D == null) {
            HUNGRY_TYPE_D = new SingletonTypeD();
        }
        return HUNGRY_TYPE_D;
    }
}
