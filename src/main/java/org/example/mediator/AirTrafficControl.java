package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class AirTrafficControl implements Mediator {

	private List<Airplane> airplaneList;

	public AirTrafficControl() {
		this.airplaneList = new ArrayList<>();
	}

	public void registerAirplane(Airplane airplane) {
		this.airplaneList.add(airplane);
	}

	@Override
	public void send(String message, Airplane sender) {
		for (Airplane airplane : airplaneList) {
			if (airplane != sender) {
				airplane.receive(message);
			}
		}
	}
}
