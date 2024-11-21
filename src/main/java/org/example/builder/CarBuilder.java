package org.example.builder;

/**
 * @author: hanchaowei
 * @date 2024/10/31
 * @description:
 */

public interface CarBuilder {
	void buildEngine();
	void buildSeats();
	void buildGPS();

	Car getCar();
}
