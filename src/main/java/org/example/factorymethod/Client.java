package org.example.factorymethod;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		PaymentCreator paymentCreator = new PayPalPaymentCreator();
		PaymentProcessor paymentProcessor = paymentCreator.createPaymentProcessor();
		paymentProcessor.pay(100);
	}
}
