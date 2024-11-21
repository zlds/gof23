package org.example.adapter;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class RectangleAdapter implements Shape {

	private LegacyRectangle legacyRectangle;

	public RectangleAdapter(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void draw() {
		legacyRectangle.drawShape();
	}
}
