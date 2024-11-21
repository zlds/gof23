package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class ConcreteHouse extends House {


	@Override
	void buildWalls() {
		System.out.println("建造混凝土墙壁");
	}

	@Override
	void buildWindows() {
		System.out.println("建造混凝土窗户");
	}

	@Override
	void buildRoof() {
		System.out.println("建造混凝土屋顶");
	}
}
