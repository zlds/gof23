package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class InfoLogger extends Logger {

	public InfoLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("Info Console::Logger: " + message);
	}
}
