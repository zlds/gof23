package org.example.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class ChatRoomImpl implements ChatRoom {
	// 负责管理所有用户的注册和消息传递，当收到一个用户发送来的消息时，将消息广播给所有的用户。

	private Map<String,User> userMap = new HashMap<>();

	@Override
	public void sendMessage(String msg, String userId) {
		User user = userMap.get(userId);
		if (user != null) {
			user.receive(msg);
		}
	}

	@Override
	public void addUser(User user) {
		this.userMap.put(user.getUserId(), user);
	}
}
