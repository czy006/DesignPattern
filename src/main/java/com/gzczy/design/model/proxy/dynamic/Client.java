package com.gzczy.design.model.proxy.dynamic;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2021-01-06 20:15
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        ITeachDao target = new TeachDao();
        //给目标对象，创建代理对象, 可以转成 ITeacherDao
        ITeachDao teachDao = (ITeachDao) new ProxyFactory(target).GetProxyInstance();
        System.out.println("proxyInstance=" + teachDao.getClass());
        teachDao.teach();
        teachDao.sayHello("czy");
    }
}
