package com.gzczy.design.model.proxy.cglib;

/**
 * @Description 客户端无需接口
 * @Author chenzhengyu
 * @Date 2021-01-07 12:37
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        //执行代理对象的方法，触发 intercept 方法，从而实现 对目标对象的调用
        TeacherDao instance = (TeacherDao) factory.getProxyInstance();
        instance.teach();
    }
}
