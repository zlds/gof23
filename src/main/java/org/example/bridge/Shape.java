package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

abstract class Shape {

	// 桥接
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}


	// 画图
	abstract public String draw();



}
