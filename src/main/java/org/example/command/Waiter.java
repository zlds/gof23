package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class Waiter {


	private Order order;

	public void takeOrder(Order order) {
		this.order = order;
	}

	//
	public void placeOrder() {
		order.execute();
	}

}
