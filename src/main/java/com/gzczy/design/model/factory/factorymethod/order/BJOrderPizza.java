package com.gzczy.design.model.factory.factorymethod.order;

import com.gzczy.design.model.factory.factorymethod.pizza.BJCheesePizza;
import com.gzczy.design.model.factory.factorymethod.pizza.BJPepperPizza;
import com.gzczy.design.model.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	public Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
