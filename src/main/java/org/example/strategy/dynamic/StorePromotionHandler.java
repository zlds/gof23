package org.example.strategy.dynamic;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class StorePromotionHandler {

	public void applyPromotion(Order order, String type) {
		List<PromotionCalculator> strategiesForStore = PromotionStrategyManager.getStrategiesForStore(
				order.getStoreId());

		for (PromotionCalculator promotionCalculator : strategiesForStore) {
			double discount = promotionCalculator.calculateDiscount(order);
		}
	}
}
