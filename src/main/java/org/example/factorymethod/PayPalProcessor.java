package org.example.factorymethod;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("PayPalProcessor pay: " + amount);
	}
}
