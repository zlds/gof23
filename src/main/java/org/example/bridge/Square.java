package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "正方形 " + color.fill();
	}
}
