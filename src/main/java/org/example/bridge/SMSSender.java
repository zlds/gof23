package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class SMSSender implements MessageSender {


	public void send(String message) {
		System.out.println("SMS: "  + message);
	}

}
