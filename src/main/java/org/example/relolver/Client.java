package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description:
 */

public class Client {


	public static void main(String[] args) {


		Expression add = new AddExpression(new Number(5),new Number(3));
		int calculate = add.calculate();
		System.out.println("5 + 3 = "+ calculate);

		Expression sub = new SubtractExpression(new Number(5),new Number(3));
		int calculate1 = sub.calculate();
		System.out.println("5 - 3 = "+ calculate1);


	}
}
