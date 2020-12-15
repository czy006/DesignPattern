package com.gzczy.design.model.composite;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2020-12-15 16:09
 */
public class Client {

    public static void main(String[] args) {
        University gkd = new University("广州科技职业技术大学", "科技创新学校");
        College c1 = new College("计算机工程学院", "计算机工程学院是我院校本科项目");
        College c2 = new College("国际贸易学院", "主要是外贸");
        gkd.add(c1);
        gkd.add(c2);
        Department d1 = new Department("计算机与科学", "计算机科学工程");
        Department d2 = new Department("大数据开发", "大数据hadoop");
        Department d3 = new Department("嵌入式开发", "嵌入式微机原理");
        c1.add(d1);
        c1.add(d2);
        c1.add(d3);
        Department d4 = new Department("国际贸易", "国际贸易");
        Department d5 = new Department("商务英语", "英语专业");
        c2.add(d4);
        c2.add(d5);
        //打印学校的组织架构
        gkd.print();
    }
}
