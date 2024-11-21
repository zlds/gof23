package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class SaladOrder implements Order {

	private Chef chef;

	public SaladOrder(Chef chef) {
		this.chef = chef;
	}

	@Override
	public void execute() {
		chef.makeSalad();
	}
}
