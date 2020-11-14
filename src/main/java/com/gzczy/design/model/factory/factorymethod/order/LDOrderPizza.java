package com.gzczy.design.model.factory.factorymethod.order;

import com.gzczy.design.model.factory.factorymethod.pizza.LDCheesePizza;
import com.gzczy.design.model.factory.factorymethod.pizza.LDPepperPizza;
import com.gzczy.design.model.factory.factorymethod.pizza.Pizza;


public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
