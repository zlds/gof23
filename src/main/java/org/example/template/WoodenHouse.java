package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class WoodenHouse extends House {

	@Override
	void buildWalls() {
		System.out.println("建造木墙");
	}

	@Override
	void buildWindows() {
		System.out.println("建造木窗户");
	}

	@Override
	void buildRoof() {
		System.out.println("建造木屋顶");
	}
}
