package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class CommandPatternDemo {

	public static void main(String[] args) {

		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);

		RemoteControl control = new RemoteControl();

		control.setCommand(lightOnCommand);
		control.pressButton();
		control.setCommand(lightOffCommand);
		control.pressButton();


	}
}
