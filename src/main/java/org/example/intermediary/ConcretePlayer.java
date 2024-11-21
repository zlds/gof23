package org.example.intermediary;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description: 具体对象
 */

public class ConcretePlayer extends Player {
	public ConcretePlayer(GameRoom gameRoom) {
		super(gameRoom);
	}
	@Override
	public void send(String message) {
		System.out.println("发送消息：" + message);
		gameRoom.send(message, this);
	}
	@Override
	public void receive(String message) {
		System.out.println("接收消息：" + message);
	}
}
