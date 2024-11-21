package org.example.strategy.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class PromotionStrategyManager {


	// 注册所有策略
	private static Map<String,PromotionCalculator>  PROMOTION_CALCULATOR_MAP = new HashMap<>();
	static {
		PROMOTION_CALCULATOR_MAP.put("points",new PointsCalculator());
		PROMOTION_CALCULATOR_MAP.put("coupon",new CouponCalculator());
	}

	public static PromotionCalculator getStrategy(String key) {
		return PROMOTION_CALCULATOR_MAP.get(key);
	}

	// 获取某个店铺的所有策略
	public static List<PromotionCalculator> getStrategiesForStore(String storeId) {
		return Arrays.asList(PROMOTION_CALCULATOR_MAP.get("points"),PROMOTION_CALCULATOR_MAP.get("coupon"));
	}

}
