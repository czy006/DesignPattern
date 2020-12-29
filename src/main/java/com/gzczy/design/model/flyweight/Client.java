package com.gzczy.design.model.flyweight;

/**
 * @Description 客户端
 * 客户端通过工厂类创建网站，如果网站已经有了则在同一类型发布
 * @Author chenzhengyu
 * @Date 2020-12-29 16:19
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        // 客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));
        // 客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));
        // 客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("smith"));
        // 客户要一个以博客形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("king"));
        System.out.println("网站的分类共=" + factory.getWebCountSize());
    }
}
