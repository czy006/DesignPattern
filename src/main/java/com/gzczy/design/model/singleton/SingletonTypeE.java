package com.gzczy.design.model.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 单例模式-懒汉式-线程安全（二阶段检验）
 * @Author chenzhengyu
 * @Date 2020-11-12 20:50
 */
public class SingletonTypeE {

    public static class ThreadSafeTest implements Runnable {

        public Set<SingletonTypeE> singles = new HashSet<SingletonTypeE>();

        @Override
        public void run() {
            //获取单例
            SingletonTypeE s = SingletonTypeE.getInstance();
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

    private static SingletonTypeE HUNGRY_TYPE_E;

    //当这里产生了多个对象就会存在问题，不是一个对象了
    private SingletonTypeE() {
        System.out.println("这是在构造方法中的一句话，用来验证产生了几个对象");
    }

    //通过2次检验null 提高加锁效率，如果不是空直接无需进入加锁阶段
    public static SingletonTypeE getInstance() {
        if (HUNGRY_TYPE_E == null) {
            synchronized (SingletonTypeE.class){
                if (HUNGRY_TYPE_E == null){
                    HUNGRY_TYPE_E = new SingletonTypeE();
                }
            }
        }
        return HUNGRY_TYPE_E;
    }
}
