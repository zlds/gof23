package org.example.strategy;

import java.util.HashMap;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class PromotionStrategyFactory {

	private static HashMap<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN.name(), new ManJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN.name(), new FanXianPromotionStrategy());
	}

	private PromotionStrategyFactory() {}

	public static PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy == null ? new EmptyPromotionStrategy() : promotionStrategy;
	}
}
