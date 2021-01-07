package com.gzczy.design.model.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2021-01-06 20:15
 */
public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    //构造器 对target 进行初始化

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 通过JDK代理 在内存中动态生成代理类
     * 1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
     * 2. Class<?>[] interfaces:  目标对象实现的接口类型，使用泛型方法确认类型
     * 3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
     *
     * @return
     */
    public Object GetProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理执行开始....");
                    Object result = method.invoke(target, args);
                    System.out.println("JDK代理执行结束....");
                    return result;
                });
    }
}
