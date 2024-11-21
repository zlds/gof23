package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class ConsoleLogger extends Logger {


	public ConsoleLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
