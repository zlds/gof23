package org.example.singleton;

/**
 * @author: hanchaowei
 * @date 2024/10/29
 * @description: 双重检查锁定
 */

public class DualSingleton {

	private static volatile DualSingleton instance;

	private DualSingleton(){}

	public static  DualSingleton getInstance() {
		if (instance == null) {
			synchronized (DualSingleton.class) {
				if (instance == null) {
					instance = new DualSingleton();
				}
			}
		}
		return instance;
	}
}
