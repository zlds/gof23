package org.example.bridge;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedColor());
		Shape blueSquare = new Square(new BlueColor());

		System.out.println(redCircle.draw());
		System.out.println(blueSquare.draw());
	}
}
