package org.example.builder;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class Director {
	private CarBuilder carBuilder;


	public Director(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public void constructSportsCar() {
		carBuilder.buildEngine();
		carBuilder.buildSeats();
		carBuilder.buildGPS();
	}

	public Car getCar() {
		return carBuilder.getCar();
	}
}
