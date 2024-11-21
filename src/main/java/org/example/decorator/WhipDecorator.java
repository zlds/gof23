package org.example.decorator;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class WhipDecorator extends CoffeeDecorator {

	public WhipDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost() {
		return super.cost() + 0.7;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ,加奶泡";
	}
}
