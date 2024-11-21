package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class XiaomiFactory implements ElectronicsFactory {

	@Override
	public Smartphone createSmartphone() {
		return new XiaomiSmartphone();
	}

	@Override
	public Router createRouter() {
		return new XiaomiRouter();
	}

	@Override
	public Fridge createFridge() {
		return new XiaomiFridge();
	}
}
