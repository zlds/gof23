package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

abstract class Message {

	protected  MessageSender sender;


	public Message(MessageSender sender) {
		this.sender = sender;
	}

	abstract void send(String message);



}
