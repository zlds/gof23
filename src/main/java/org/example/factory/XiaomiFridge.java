package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class XiaomiFridge implements Fridge {

	@Override
	public void cool() {
		System.out.println("Xiaomi Fridge is cooling");
	}

}
