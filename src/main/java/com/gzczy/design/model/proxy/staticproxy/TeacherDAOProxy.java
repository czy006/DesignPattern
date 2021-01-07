package com.gzczy.design.model.proxy.staticproxy;

/**
 * @Description 代理类
 * @Author chenzhengyu
 * @Date 2021-01-06 19:54
 */
public class TeacherDAOProxy implements ITeacherDao {

    private ITeacherDao iteacherDao;

    public TeacherDAOProxy(ITeacherDao iteacherDao) {
        this.iteacherDao = iteacherDao;
    }


    @Override
    public void teach() {
        System.out.println("开始代理，完成某些操作。。。。。 ");
        iteacherDao.teach();
        System.out.println("代理完毕！");
    }
}
