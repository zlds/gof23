package org.example.strategy.dynamic;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		Order order = new Order();
		PromotionCalculator promotionCalculator = PromotionFactory.getPromotionCalculator("points");
		double discount = promotionCalculator.calculateDiscount(order);
		System.out.println(discount);
	}
}
