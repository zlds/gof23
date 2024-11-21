package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class GreenState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficlight) {
		System.out.println("绿灯行");
		trafficlight.setState(new YellowState());
	}
}
