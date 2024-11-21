package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// 建立一个聊天室
		ChatRoom chatRoom = new ChatRoomImpl();
		// 创建对象
		User user1 = new ChatUser(chatRoom,"1","张三");
		User user2 = new ChatUser(chatRoom,"2","李四");
		User user3 = new ChatUser(chatRoom,"3","王五");
		// 将对象添加到聊天室
		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		chatRoom.addUser(user3);

		user1.send("大家好!");
		user2.send("嗨，张三!");
	}
}
