package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public interface ElectronicsFactory {

	Smartphone createSmartphone();
	Router createRouter();
	Fridge createFridge();

}
