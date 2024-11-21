package org.example.decorator;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class SimpleCoffee implements Coffee {

	@Override
	public double cost() {
		return 1.0;
	}

	@Override
	public String getDescription() {
		return "普通咖啡";
	}
}
