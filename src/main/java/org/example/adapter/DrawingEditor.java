package org.example.adapter;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class DrawingEditor {
	public static void main(String[] args) {
		Shape rect = new RectangleAdapter(new LegacyRectangle());
		rect.draw();
	}
}
