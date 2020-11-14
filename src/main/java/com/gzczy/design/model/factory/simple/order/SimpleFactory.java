package com.gzczy.design.model.factory.simple.order;

import com.gzczy.design.model.factory.simple.pizza.CheesePizza;
import com.gzczy.design.model.factory.simple.pizza.GreekPizza;
import com.gzczy.design.model.factory.simple.pizza.PepperPizza;
import com.gzczy.design.model.factory.simple.pizza.Pizza;

public class SimpleFactory {

	public static Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println("使用简单工厂模式订购Pizza====>");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊pizza");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪pizza");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒pizza");
		}
		
		return pizza;
	}

}
