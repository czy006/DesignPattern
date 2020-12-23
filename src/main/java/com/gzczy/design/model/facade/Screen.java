package com.gzczy.design.model.facade;

/**
 * @Description 外观模式
 * @Author chenzhengyu
 * @Date 2020-12-23 15:25
 */
public class Screen {

	private static Screen instance = new Screen();
	
	public static Screen getInstance() {
		return instance;
	}

	public void up() {
		System.out.println(" Screen up ");
	}
	
	public void down() {
		System.out.println(" Screen down ");
	}
}
