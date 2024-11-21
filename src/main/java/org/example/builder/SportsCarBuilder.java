package org.example.builder;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public class SportsCarBuilder implements CarBuilder {

	private Car car;

	public SportsCarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildGPS() {
		car.setEngine("Sports Car Engine");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Sports Car Seats");
	}

	@Override
	public void buildEngine() {
		car.setGps("Sports Car GPS");
	}

	@Override
	public Car getCar() {
		return car;
	}
}
