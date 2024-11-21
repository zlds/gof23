package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class Airplane {

	private String name;

	private Mediator mediator;

	public Airplane(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public void send(String message) {
		System.out.println(this.name + " 发送消息: " + message);
		mediator.send(message, this);
	}

	public void receive(String message) {
		System.out.println(this.name + " 接收到来自: " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
