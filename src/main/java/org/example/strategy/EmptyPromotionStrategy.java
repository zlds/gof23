package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class EmptyPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("无促销活动,原价出售");
	}
}
