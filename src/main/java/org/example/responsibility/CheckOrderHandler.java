package org.example.responsibility;



/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class CheckOrderHandler extends OrderHandler {


	@Override
	public void handleOrder(Order order) {

		if (order.getOrderNumber() == null || order.getOrderNumber() == "") {
			throw new RuntimeException("订单编号不能为空");
		}
		if (order.getShippingAddress() == null && order.getShippingAddress() == "") {
			throw new RuntimeException("收货地址不能为空");
		}

		System.out.println("订单参数校验通过");
	}
}
