package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class DeliveredState implements OrderState {

	@Override
	public void next(OrderContext context) {
		System.out.println("订单已发货");
	}

	@Override
	public void previous(OrderContext context) {
		context.setState(new ShippedState());
	}

	@Override
	public void printStatus() {
		System.out.println("已发货状态");
	}
}
