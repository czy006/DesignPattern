package com.gzczy.design.model.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2021-01-07 12:37
 */
public class ProxyFactory implements MethodInterceptor {


    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 重写	intercept 方法，会调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理开始 ...");
        Object result = method.invoke(target, objects);
        System.out.println("Cglib 代理结束 ...");
        return result;
    }

    //返回一个代理对象:是 target 对象的代理对象
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }


}
