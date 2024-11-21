package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class ErrorLogger extends Logger {

	public ErrorLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
