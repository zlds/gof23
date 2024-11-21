package org.example.flyweight;

import java.util.HashMap;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class BoxFactory {

	private static HashMap<String, AbstractBox> map;


	// 构造方法中进行初始化
	private BoxFactory() {
		map = new HashMap<String,AbstractBox>();
		map.put("I", new IBox());
		map.put("O", new OBox());
		map.put("L", new LBox());
	}


	public static final BoxFactory getInstance() {
		return SingletonHolder.INSTANCE;
	}


	// 静态内部类的方式来实现单例模式
	private static class SingletonHolder {
		private static final BoxFactory INSTANCE = new BoxFactory();
	}



	// 根据名称获取图形对象
	public AbstractBox getBox(String key) {
		return map.get(key);
	}


}
