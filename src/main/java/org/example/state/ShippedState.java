package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class ShippedState implements OrderState {

	@Override
	public void next(OrderContext context) {
		context.setState(new DeliveredState());
	}

	@Override
	public void previous(OrderContext context) {
		context.setState(new PaidState());
	}

	@Override
	public void printStatus() {
		System.out.println("已发货状态");
	}
}
