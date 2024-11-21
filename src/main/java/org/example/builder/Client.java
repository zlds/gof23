package org.example.builder;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class Client {


	public static void main(String[] args) {
		CarBuilder builder = new SportsCarBuilder();
		Director director = new Director(builder);
		director.constructSportsCar();
		Car car = director.getCar();
		car.display();
	}
}
