package org.example.responsibility;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class BuildOrderChain {

	private CheckOrderHandler checkOrderHandler;
	private StockHandler stockHandler;
	private AliPaymentHandler aliPaymentHandler;

	List<OrderHandler> list = new ArrayList<>();

	public BuildOrderChain() {
		this.list.add(new CheckOrderHandler());
		this.list.add(new StockHandler());
		this.list.add(new AliPaymentHandler());
	}


	public void doFilter(Order order) {
		System.out.println("\n正常商品检查");
		for (OrderHandler orderHandler : this.list) {
			orderHandler.handleOrder(order);
		}
	}


}
