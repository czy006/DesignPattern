package com.gzczy.design.model.decorator;

import com.gzczy.design.model.decorator.coffee.LongBlack;

public class CoffeeBar {

	public static void main(String[] args) {

		Drink order = new LongBlack();
		System.out.println("费用" + order.cost());
		System.out.println("描述" + order.getDes());

		// 2. order 加入milk
		order = new Milk(order);

		System.out.println("order 费用" + order.cost());
		System.out.println("order 描述" + order.getDes());

		// 3. order 加入巧克力

		order = new Chocolate(order);

		System.out.println("order 费用" + order.cost());
		System.out.println("order 描述" + order.getDes());


		order = new Chocolate(order);

		System.out.println("order 费用" + order.cost());
		System.out.println("order 描述" + order.getDes());

	}

}
