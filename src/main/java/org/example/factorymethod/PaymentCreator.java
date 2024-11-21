package org.example.factorymethod;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public abstract class PaymentCreator {

	public abstract PaymentProcessor createPaymentProcessor();

	public void process(double amount) {
		PaymentProcessor paymentProcessor = createPaymentProcessor();
		paymentProcessor.pay(amount);
	}
}
