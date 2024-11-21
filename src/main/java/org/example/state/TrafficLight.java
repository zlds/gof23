package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public class TrafficLight {

	private TrafficLightState state;

	public TrafficLight() {
		state = new RedState();
	}

	public void setState(TrafficLightState state) {
		this.state = state;
	}

	public void change() {
		state.handle(this);
	}
}
