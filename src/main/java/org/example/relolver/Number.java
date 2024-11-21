package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/21
 * @description: 终结符表达式
 */

public class Number implements Expression {
	// 直接表示一个数字
	private int value;


	public Number(int value) {
		this.value = value;
	}

	@Override
	public int calculate() {
		return value; // 直接返回数字本身、没有依赖
	}
}
