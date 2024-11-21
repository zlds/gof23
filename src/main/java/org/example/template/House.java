package org.example.template;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

abstract class House {

	final void buildHouse() {
		buildFoundation();
		buildWalls();
		buildWindows();
		buildRoof();
		if (isLandscapingNeeded()) {
			landscape();
		}
	}

	void buildFoundation() {
		System.out.println("打地基");
	}
	// 墙壁
	abstract void buildWalls();

	// 窗户
	abstract void buildWindows();

	// 屋顶
	abstract void buildRoof();

	// 是否需要园林
	boolean isLandscapingNeeded() {
		return true;
	}

	void landscape() {
		System.out.println("园林设计");
	}
}
