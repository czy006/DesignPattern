package com.gzczy.design.model.proxy.staticproxy;

/**
 * @Description 实现
 * @Author chenzhengyu
 * @Date 2021-01-06 19:52
 */
public class TeacherDAO implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("TeacherDAO===》Teacher is teaching ... ");
    }
}
