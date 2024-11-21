package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class Client {

	public static void main(String[] args) {


		ErrorLogger errorLogger = new ErrorLogger(1);
		DebugLogger debugLogger = new DebugLogger(2);
		InfoLogger infoLogger = new InfoLogger(3);

//		errorLogger.setNextLogger(debugLogger);
//		debugLogger.setNextLogger(infoLogger);

//		errorLogger.logMessage(1,"错误信息...");
//		errorLogger.logMessage(2,"调试信息...");
//		errorLogger.logMessage(3,"info信息...");

		debugLogger.logMessage(3,"debug级打印info日志");

		// 订单处理示例。订单需要依次经过订单检查、库存处理、支付处理。
		Order order = new Order("10000","支付宝",true,"杭州市");

		BuildOrderChain orderHandler = new BuildOrderChain(); // 正常库存处理
		orderHandler.doFilter(order);

		VirtualGoodsOrderChain virtualGoodsOrderChain = new VirtualGoodsOrderChain();
		virtualGoodsOrderChain.doFilter(order); // 虚拟商品不限库存

	}
}
