package com.gzczy.design.model.proxy.staticproxy;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2021-01-06 19:55
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDAO();
        TeacherDAOProxy proxy = new TeacherDAOProxy(teacherDao);
        proxy.teach();
    }
}
