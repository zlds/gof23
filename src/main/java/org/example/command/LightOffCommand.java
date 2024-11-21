package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description:
 */

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}
