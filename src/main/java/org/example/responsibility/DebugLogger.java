package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class DebugLogger extends Logger {


	public DebugLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("Debug Console::Logger:" + message);
	}
}
