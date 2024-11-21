package org.example.strategy;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		PriceCalculator childrenPrice = new PriceCalculator(new ChildrenPricingStrategy());
		PriceCalculator adultPrice = new PriceCalculator(new AdultPricingStrategy());
		PriceCalculator seniorPrice = new PriceCalculator(new SeniorPricingStrategy());
		System.out.println("儿童价格：" + childrenPrice.calculatePrice(100));
		System.out.println("成人价格：" + adultPrice.calculatePrice(100));
		System.out.println("老年人价格：" + seniorPrice.calculatePrice(100));

		// 促销活动策略
		System.out.println("======= 促销活动策略 =======");
		PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(PromotionKey.MANJIAN.name());
		PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
		promotionActivity.execute();
	}


}
