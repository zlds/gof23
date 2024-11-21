package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class YellowState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficlight) {
		System.out.println("黄灯亮");
		trafficlight.setState(new RedState());
	}
}
