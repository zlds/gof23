package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class PriceCalculator {

	private PricingStrategy strategy;

	public PriceCalculator(PricingStrategy strategy) {
		this.strategy = strategy;
	}


	public double calculatePrice(double price) {
		return strategy.calculatePrice(price);
	}


}
