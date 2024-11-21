package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class EmailSender implements MessageSender {

	@Override
	public void send(String message) {
		System.out.println("Email: " + message);
	}
}
