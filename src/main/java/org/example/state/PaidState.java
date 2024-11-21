package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class PaidState implements OrderState {

	@Override
	public void next(OrderContext context) {
		context.setState(new ShippedState());
	}

	@Override
	public void previous(OrderContext context) {
		context.setState(new PendingState());
	}

	@Override
	public void printStatus() {
		System.out.println("已支付状态");
	}
}
