package org.example.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class VirtualGoodsOrderChain {

	private CheckOrderHandler checkOrderHandler;

	private AliPaymentHandler aliPaymentHandler;


	List<OrderHandler> list = new ArrayList<>();

	public VirtualGoodsOrderChain() {
		this.list.add(new CheckOrderHandler());
		this.list.add(new AliPaymentHandler());
	}


	public void doFilter(Order order) {
		System.out.println("\n虚拟商品检查");
		for (OrderHandler orderHandler : list) {
			orderHandler.handleOrder(order);
		}
	}

}
