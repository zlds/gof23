package org.example.memo;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description: 备忘录
 */

public class Memento {

	private String content;

	public Memento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
