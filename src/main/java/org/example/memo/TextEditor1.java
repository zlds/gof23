package org.example.memo;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class TextEditor1 {

	private StringBuffer content;

	public TextEditor1() {
		this.content = new StringBuffer();
	}

	public void write(String text) {
		content.append(text);
		System.out.println("写入内容：" + text.toString());
	}


}
