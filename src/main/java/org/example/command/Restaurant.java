package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class Restaurant {

	public static void main(String[] args) {
		Chef chef = new Chef();

		Order hamburger = new HamburgerOrder(chef);
		Order salad = new SaladOrder(chef);

		Waiter waiter = new Waiter();
		waiter.takeOrder(hamburger);
		waiter.placeOrder();

		waiter.takeOrder(salad);
		waiter.placeOrder();
	}
}
