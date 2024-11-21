package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		Game chess = new Chess();
		chess.play();
		System.out.println("===================================");
		Game football = new Football();
		football.play();

		System.out.println("===================================");
		// 造房子案例
		House concreteHouse = new ConcreteHouse();
		concreteHouse.buildHouse();
		System.out.println("===================================");
		House woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
	}

}
