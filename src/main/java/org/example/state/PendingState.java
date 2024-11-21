package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description: 待支付状态
 */

public class PendingState implements OrderState {

	@Override
	public void next(OrderContext context) {
		context.setState(new PaidState());
	}

	@Override
	public void previous(OrderContext context) {
		System.out.println("订单已经是初始状态");
	}

	@Override
	public void printStatus() {
		System.out.println("待支付状态");
	}
}
