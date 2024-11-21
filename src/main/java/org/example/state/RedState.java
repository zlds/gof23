package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class RedState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficlight) {
		System.out.println("红灯停");
		trafficlight.setState(new GreenState());
	}
}
