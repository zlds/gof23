package org.example.singleton;

/**
 * @author: hanchaowei
 * @date 2024/10/29
 * @description:
 */

public class SingletonSafety {

	private static SingletonSafety instance;


	private SingletonSafety(){}


	public static synchronized SingletonSafety getInstance() {
		if (instance == null) {
			instance = new SingletonSafety();
		}
		return instance;
	}
}
