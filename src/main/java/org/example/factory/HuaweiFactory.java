package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class HuaweiFactory implements ElectronicsFactory {

	@Override
	public Smartphone createSmartphone() {
		return new HuaweiSmartphone();
	}

	@Override
	public Router createRouter() {
		return new HuaweiRouter();
	}

	@Override
	public Fridge createFridge() {
		return null;
	}
}
