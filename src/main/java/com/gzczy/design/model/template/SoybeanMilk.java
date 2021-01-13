package com.gzczy.design.model.template;

/**
 * @Description 豆浆抽象类
 * @Author chenzhengyu
 * @Date 2021-01-13 14:32
 */
public abstract class SoybeanMilk {

    /**
     * 制造豆浆
     */
    final void make(){
        select();
        // 是否需要添加配料由钩子方法决定
        if (isAddCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    /**
     * 选择材料
     */
    void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    /**
     * 添加不同的材料 做成抽象方法
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要 3 小时 ");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

    /**
     * 提供钩子方法
     * @return 默认返回false 无需添加配料
     */
    Boolean isAddCondiments(){
        return false;
    }
}
