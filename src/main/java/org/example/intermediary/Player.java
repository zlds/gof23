package org.example.intermediary;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description: 抽象对象
 */

public abstract class Player {
	protected GameRoom gameRoom;
	public Player(GameRoom gameRoom) {
		this.gameRoom = gameRoom;
	}
	public abstract void send(String message);
	public abstract void receive(String message);
}
