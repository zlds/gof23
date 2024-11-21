package org.example.decorator;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee simpleCoffee = new SimpleCoffee();
		Coffee mochaCoffee = new MochaDecorator(simpleCoffee);
		Coffee whipMochaCoffee = new WhipDecorator(mochaCoffee);
		System.out.println(whipMochaCoffee.getDescription() + " 价格：" + whipMochaCoffee.cost());
	}
}
