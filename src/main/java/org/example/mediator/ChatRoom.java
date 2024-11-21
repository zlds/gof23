package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public interface ChatRoom {

	void sendMessage(String msg, String userId);

	void addUser(User user);
}
