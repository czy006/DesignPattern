package com.gzczy.design.model.composite;

/**
 * @Description 三级 add remove 无需填写 已经是叶子节点
 * @Author chenzhengyu
 * @Date 2020-12-15 16:10
 */
public class Department extends OrganizationComponent {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
