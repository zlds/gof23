package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		// 指挥中心
		AirTrafficControl atc = new AirTrafficControl();

		Airplane airplane1 = new Airplane("飞机1", atc);
		Airplane airplane2 = new Airplane("飞机2", atc);
		Airplane airplane3 = new Airplane("飞机3", atc);
		atc.registerAirplane(airplane1);
		atc.registerAirplane(airplane2);
		atc.registerAirplane(airplane3);

		airplane1.send("飞机2，飞机3，我是飞机1，我要降落了");
		airplane2.send("飞机1，飞机3，我是飞机2，我要降落了");
		airplane3.send("飞机1，飞机2，我是飞机3，我要降落了");
	}
}
