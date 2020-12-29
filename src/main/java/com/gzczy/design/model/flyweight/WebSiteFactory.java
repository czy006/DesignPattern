package com.gzczy.design.model.flyweight;

import java.util.HashMap;

/**
 * @Description 网站工厂类
 * @Author chenzhengyu
 * @Date 2020-12-29 16:20
 */
public class WebSiteFactory {

    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
       if (!pool.containsKey(type)){
           pool.put(type, new ConcreteWebSite(type));
       }
       return pool.get(type);
    }

    public int getWebCountSize(){
        return pool.size();
    }
}
