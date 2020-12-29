package com.gzczy.design.model.flyweight;

/**
 * @Description 具体网站(享)
 * @Author chenzhengyu
 * @Date 2020-12-29 16:19
 */
public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型：" + type +",使用者是："+user.getName());
    }
}
