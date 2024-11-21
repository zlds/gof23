package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class OrderContext {

	private OrderState currentState;

	public OrderContext() {
		this.currentState = new PendingState();
	}

	public void setState(OrderState orderState) {
		this.currentState = orderState;
	}

	public void next() {
		currentState.next(this);
	}

	public void previous() {
		currentState.previous(this);
	}

	public void printStatus() {
		currentState.printStatus();
	}
}
