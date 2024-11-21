package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public abstract class User {

	protected ChatRoom chatRoom;

	protected String userId;
	protected  String name;

	public User(ChatRoom chatRoom, String userId, String name) {
		this.chatRoom = chatRoom;
		this.userId = userId;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
