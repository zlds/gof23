package org.example.intermediary;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class MediatorPatternDemo {

	public static void main(String[] args) {
		GameRoom gameRoom = new ConcreteGameRoom();
		Player player1 = new ConcretePlayer(gameRoom);
		Player player2 = new ConcretePlayer(gameRoom);
		Player player3 = new ConcretePlayer(gameRoom);
		((ConcreteGameRoom) gameRoom).addPlayer(player1);
		((ConcreteGameRoom) gameRoom).addPlayer(player2);
		((ConcreteGameRoom) gameRoom).addPlayer(player3);
		player1.send("Hello, everyone!");
		player2.send("Hi, there!");
	}
}
