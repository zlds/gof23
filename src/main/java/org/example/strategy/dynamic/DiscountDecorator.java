package org.example.strategy.dynamic;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class DiscountDecorator implements PromotionCalculator {

	private PromotionCalculator next;

	public DiscountDecorator(PromotionCalculator next) {
		this.next = next;
	}

	@Override
	public double calculateDiscount(Order order) {
		if (next != null) {
			double baseDiscount = next.calculateDiscount(order);
			System.out.println("基础折扣：" + baseDiscount);
			return baseDiscount;
		}
		return 0;
	}
}
