package com.gzczy.design.model.facade;

/**
 * @Description 外观模式
 * @Author chenzhengyu
 * @Date 2020-12-23 15:25
 */
public class Client {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}

}
