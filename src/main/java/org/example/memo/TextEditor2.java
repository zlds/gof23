package org.example.memo;

/**
 * @author: hanchaowei
 * @date 2024/11/12
 * @description:
 */

public class TextEditor2 {

	private StringBuilder content;

	public TextEditor2() {
		content = new StringBuilder();
	}


	public void write(String text) {
		content.append(text);
		System.out.println("当前写入内容：" + text.toString());
	}



	public Memento save() {
		return new Memento(content.toString());
	}

	public void restore(Memento memento) {
		content = new StringBuilder(memento.getContent());
	}



	public String display() {
		return content.toString();
	}

}
