package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class AliPaymentHandler extends OrderHandler {


	@Override
	public void handleOrder(Order order) {

		if (!order.getPaymentMethod().equals("支付宝")) {
			throw new RuntimeException("不支持支付宝以外的支付方式");
		}

		System.out.println("支付宝预下单成功");
	}
}
