package org.example.flyweight;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class ConcreteChessPiece implements ChessPiece {

	private final String color;

	public ConcreteChessPiece(String color) {
		this.color = color;
	}

	@Override
	public void place(int x, int y) {
		System.out.println("在(" + x + ", " + y + ")放了一个" + color + "棋子");
	}
}
