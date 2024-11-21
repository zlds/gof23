package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class ChatUser extends User {



	public ChatUser(ChatRoom chatRoom,String userId, String name) {
		super(chatRoom, userId, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + "发送消息：" + msg);
		chatRoom.sendMessage(msg, userId);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + "接收消息：" + msg);
	}
}
