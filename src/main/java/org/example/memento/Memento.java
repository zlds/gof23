package org.example.memento;

/**
 * @author: hanchaowei
 * @date 2024/11/12
 * @description: 备忘录对象
 */

public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}


}
