package org.example.singleton;

/**
 * @author: hanchaowei
 * @date 2024/10/29
 * @description:
 */

public class Singleton {


	private static Singleton singleton;


	private Singleton(){}


	// 懒汉模式。用到的时候去加载、非线程安全。
	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
