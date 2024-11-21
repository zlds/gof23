package org.example.responsibility;


/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

abstract class Logger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;



	// 级别
	protected int level;
	// 责任链中的下一个元素
	protected Logger nextLogger;


	public Logger(int level) {
		this.level = level;
	}

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level,message);
		}
	}

	abstract void write(String message);

}
