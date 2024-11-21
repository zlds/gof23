package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class FanXianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("返现促销，返优惠券10元");
	}
}
