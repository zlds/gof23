package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class ManJianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("满减促销，满100-20元");
	}
}
