package com.gzczy.design.model.flyweight;

/**
 * @Description 常量池测试
 * 结论：如果 Integer.valueOf(x) x 在	-128 --- 127 直接，就是使用享元模式返回,如果不在
 * 范围内，则仍然 new
 * @Author chenzhengyu
 * @Date 2020-12-29 16:06
 */
public class IntegerCache {

    public static void main(String[] args) {

        //小结:
        //1. 在 valueOf 方法中，先判断值是否在 IntegerCache 中，如果不在，就创建新的 Integer(new),  否则，就直接从 缓存池返回
        //2. valueOf 方法，就使用到享元模式
        //3. 如果使用 valueOf 方法得到一个 Integer 实例，范围在 -128 - 127  ，执行速度比 new 快

        Integer x = Integer.valueOf(127); // 得到 x 实例，类型 Integer
        Integer y = new Integer(127); // 得 到 y 实 例 ， 类 型 Integer
        Integer z = Integer.valueOf(127);//..
        Integer w = new Integer(127);

        System.out.println(x.equals(y)); // 大小，true
        System.out.println(x == y ); //	false
        System.out.println(x == z ); // true
        System.out.println(w == x ); // false
        System.out.println(w == y ); // false

        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1==x2：" + (x1 == x2)); // false
    }
}
