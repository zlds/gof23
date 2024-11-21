package org.example.factorymethod;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class PayPalPaymentCreator extends PaymentCreator {

	public PayPalProcessor createPaymentProcessor() {
		return new PayPalProcessor();
	}
}
