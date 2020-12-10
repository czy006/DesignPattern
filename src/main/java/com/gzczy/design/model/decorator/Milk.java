package com.gzczy.design.model.decorator;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes("添加牛奶");
		setPrice(2.0f); 
	}

}
