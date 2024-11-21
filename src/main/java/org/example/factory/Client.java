package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		ElectronicsFactory electronicsFactory = new XiaomiFactory();
		Smartphone smartphone = electronicsFactory.createSmartphone();
		smartphone.display();
		Router router = electronicsFactory.createRouter();
		router.route();
		// 切换到华为工厂
		electronicsFactory = new HuaweiFactory();

		Smartphone smartphone1 = electronicsFactory.createSmartphone();
		Router router1 = electronicsFactory.createRouter();
		smartphone1.display();
		router1.route();
	}
}
