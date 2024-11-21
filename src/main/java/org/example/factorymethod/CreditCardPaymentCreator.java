package org.example.factorymethod;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class CreditCardPaymentCreator extends PaymentCreator {

	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new CreditCardProcessor();
	}
}
