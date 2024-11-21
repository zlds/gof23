package org.example.flyweight;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description:
 */

public class ConcreteFontStyle implements FontStyle {

	private final String fontName;
	private final int fontSize;

	public ConcreteFontStyle(String fontName, int fontSize) {
		this.fontName = fontName;
		this.fontSize = fontSize;
		System.out.println("创建了一个字体样式：" + fontName + ", " + fontSize);
	}

	@Override
	public void applyFont(String text, int positionX, int positionY) {
		System.out.println("将字体：" + fontName + " 大小：" + fontSize + " 应用到文本：" + text + " 位置：(" + positionX + ", " + positionY + ")");
	}
}
