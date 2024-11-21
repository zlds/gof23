package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

abstract class Game {


	public abstract void initializeGame();

	public abstract void playGame();

	public abstract void endGame();

	public final void play() {
		initializeGame();
		playGame();
		endGame();
	}
}
