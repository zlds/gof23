package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "圆形 " + color.fill();
	}
}
