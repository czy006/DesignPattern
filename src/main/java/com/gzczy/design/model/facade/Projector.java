package com.gzczy.design.model.facade;

/**
 * @Description 外观模式
 * @Author chenzhengyu
 * @Date 2020-12-23 15:25
 */
public class Projector {

	private static Projector instance = new Projector();
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" Projector on ");
	}
	
	public void off() {
		System.out.println(" Projector ff ");
	}
	
	public void focus() {
		System.out.println(" Projector is Projector  ");
	}
	
	//...
}
