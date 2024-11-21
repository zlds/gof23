package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description: 享元工厂
 */

public class ChessPieceFactory {


	private static final Map<String, ChessPiece> pieces = new HashMap<>();

	public static ChessPiece getChessPiece(String color) {
		if (!pieces.containsKey(color)) {
			pieces.put(color, new ConcreteChessPiece(color));
		}
		return pieces.get(color);
	}
}
