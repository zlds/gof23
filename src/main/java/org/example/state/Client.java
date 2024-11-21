package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		Character character = new Character();
		character.walk();
		character.run();
		character.jump();
		character.idle();


		character.run();
		character.jump();


		// 红绿灯示例
		TrafficLight trafficLight = new TrafficLight();
		for (int i = 0; i < 6; i++) {
			trafficLight.change();
		}

		// 订单状态示例
		System.out.println("======== 订单状态示例 ========");
		OrderContext order = new OrderContext();
		order.printStatus();
		order.next();
		order.printStatus();
		order.next();
		order.printStatus();
	}
}
