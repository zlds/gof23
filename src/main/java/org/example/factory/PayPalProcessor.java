package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Paying with PayPal: " + amount);
	}
}
