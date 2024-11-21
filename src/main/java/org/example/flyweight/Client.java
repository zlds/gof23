package org.example.flyweight;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		// 方块案例
		BoxFactory boxFactory = BoxFactory.getInstance();
		AbstractBox box1 = boxFactory.getBox("I");

		BoxFactory boxFactory1 = BoxFactory.getInstance();
		AbstractBox box2 = boxFactory1.getBox("I");

		System.out.println(box1.equals(box2));
		System.out.println(box1 == box2);

		// 象棋案例
		ChessPiece black1 = ChessPieceFactory.getChessPiece("black");
		ChessPiece black2 = ChessPieceFactory.getChessPiece("black");
		ChessPiece white1 = ChessPieceFactory.getChessPiece("white");
		black1.place(1,2);
		black2.place(2,2);
		white1.place(1,2);


	}
}
