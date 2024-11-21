package org.example.strategy.dynamic;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class CouponCalculator implements PromotionCalculator {

	@Override
	public double calculateDiscount(Order order) {
		System.out.println("优惠卷");
		return 1;
	}
}
