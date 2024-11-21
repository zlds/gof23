package org.example.decorator;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public double cost() {
		return decoratedCoffee.cost();
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}
}
