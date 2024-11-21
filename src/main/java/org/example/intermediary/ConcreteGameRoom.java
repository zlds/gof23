package org.example.intermediary;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class ConcreteGameRoom extends GameRoom {
	private List<Player> players = new ArrayList<>();

	public void addPlayer(Player player) {
		players.add(player);
	}
	@Override
	public void send(String message, Player player) {
		for (Player p : players) {
			if (!p.equals(player)) {
				p.receive(message);
			}
		}
	}
}
