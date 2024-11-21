package org.example.singleton;

/**
 * @author: hanchaowei
 * @date 2024/10/29
 * @description:
 */

public class HungrySingleton {
	//
	private static final HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {}

	// 饿汉模式，提前加载，自己创建自己。在类架子上就完成初始化。
	public static HungrySingleton getInstance() {
		return instance;
	}

}
