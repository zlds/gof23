package org.example.command;

/**
 * @author: hanchaowei
 * @date 2024/11/8
 * @description: 调用者
 */

public class RemoteControl {

	// 调用者持有命令对象，并在某个时间点调用命令对象execute()方法

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

}
