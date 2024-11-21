package org.example.memento;

/**
 * @author: hanchaowei
 * @date 2024/11/12
 * @description: 发起人对象
 */

public class Originator {

	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
