package com.gzczy.design.model.factory.simple.order;

import com.gzczy.design.model.factory.simple.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza {

	Pizza pizza = null;
	String orderType = "";

	public OrderPizza() {
		
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza(orderType);
			//订购成功
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购pizza失败，退出程序。。。");
				break;
			}
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
