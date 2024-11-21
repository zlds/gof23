package org.example.strategy.dynamic;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class PointsCalculator implements PromotionCalculator {

	@Override
	public double calculateDiscount(Order order) {
		System.out.println("积分");
		return 0;
	}
}
