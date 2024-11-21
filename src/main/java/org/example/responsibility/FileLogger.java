package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class FileLogger extends Logger {

	public FileLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
