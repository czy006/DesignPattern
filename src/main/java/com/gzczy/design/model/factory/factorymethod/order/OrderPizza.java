package com.gzczy.design.model.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.gzczy.design.model.factory.factorymethod.pizza.Pizza;

public abstract class OrderPizza {

	abstract Pizza createPizza(String orderType);

	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			pizza = createPizza(orderType);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}


	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
