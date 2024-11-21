package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class TeenagerPricingStrategy implements PricingStrategy {

	@Override
	public double calculatePrice(double price) {
		return price * 0.75;
	}
}
