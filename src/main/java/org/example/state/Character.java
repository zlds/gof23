package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class Character {

	private String state = "idle";

	// 走
	public void walk() {
		if (state.equals("idle")) {
			state = "walking";
			System.out.println("开始走路");
		} else {
			System.out.println("当前状态无法走路");
		}
	}

	// 跑
	public void run() {
		if (state.equals("walking")) {
			state = "running";
			System.out.println("开始跑步");
		} else {
			System.out.println("当前状态无法跑步");
		}
	}

	// 跳
	public void jump() {
		if (state.equals("running")) {
			state = "jumping";
			System.out.println("开始跳跃");
		} else {
			System.out.println("当前状态无法跳跃");
		}
	}

	// 站立不动
	public void idle() {
		state = "idle";
		System.out.println("站立不动");
	}


}
