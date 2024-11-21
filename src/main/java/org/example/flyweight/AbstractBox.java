package org.example.flyweight;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public abstract class AbstractBox {



	public abstract String getShape();

	public void display(String color) {
		System.out.println("方块形状：" + getShape() + ", 颜色：" + color);
	}

}
