package org.example.intermediary;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description: 抽象中介者
 */

public abstract class GameRoom {

	public abstract void send(String message, Player player);
}
