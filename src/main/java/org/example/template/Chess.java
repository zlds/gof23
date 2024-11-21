package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class Chess extends Game {

	@Override
	public void initializeGame() {
		System.out.println("国际象棋游戏已初始化！ 开始游戏吧.");
	}
	@Override
	public void playGame() {
		System.out.println("游戏开始. 欢迎来到棋局!");
	}
	@Override
	public void endGame() {
		System.out.println("游戏结束. 感谢您的参与!");
	}

}
