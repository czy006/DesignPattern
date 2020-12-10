package com.gzczy.design.model.decorator;

/**
 * @Description 装饰者模式 调味品
 * @Author chenzhengyu
 * @Date 2020-12-10 09：01
 */
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes("巧克力");
		setPrice(3.0f);
	}

}
