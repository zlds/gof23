package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description: 工厂方法模式
 */

public abstract class PaymentCreator {

	// 工厂方法
	public abstract PaymentProcessor createPaymentProcessor();

	public void process(double amount) {
		PaymentProcessor processor = createPaymentProcessor();
		processor.processPayment(amount);
	}
}
