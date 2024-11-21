package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class PromotionActivity {

	private PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public void execute() {
		promotionStrategy.doPromotion();
	}


}
