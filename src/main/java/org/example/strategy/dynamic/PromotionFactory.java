package org.example.strategy.dynamic;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class PromotionFactory {

	public static PromotionCalculator getPromotionCalculator(String type) {
		switch (type) {
			case "points":
				return new PointsCalculator();
			case "coupon":
				return new CouponCalculator();
			default:
				return null;
		}
	}
}
