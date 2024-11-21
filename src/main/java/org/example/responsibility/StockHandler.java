package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class StockHandler extends OrderHandler {


	@Override
	public void handleOrder(Order order) {

		if (!order.isStockAvailability()) {
			throw new RuntimeException("订单库存不足");
		}

		System.out.println("库存扣减成功");
	}
}
