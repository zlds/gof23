package org.example.decorator;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class MochaDecorator extends CoffeeDecorator {

	public MochaDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost() {
		return super.cost() + 0.5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " ,加摩卡";
	}
}
