package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class HamburgerOrder implements Order {

	private Chef chef;

	public HamburgerOrder(Chef chef) {
		this.chef = chef;
	}

	@Override
	public void execute() {
		chef.makeHamburger();
	}
}
