package org.example.builder;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */
public class Car {

	private String engine;

	private String seats;

	private String gps;


	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public void display() {
		System.out.println("Car [engine=" + engine + ", seats=" + seats + ", gps=" + gps + "]");
	}
}
