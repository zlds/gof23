package org.example.responsibility;

/**
 * @author: hanchaowei
 * @date 2024/11/18
 * @description:
 */

public class ChainPatternDemo {

	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		Logger chainOfLoggers = getChainOfLoggers();
		chainOfLoggers.logMessage(Logger.INFO, "这些Info日志");
		chainOfLoggers.logMessage(Logger.DEBUG,"这是Debug日志");
		chainOfLoggers.logMessage(Logger.ERROR,"这是Error日志");
	}

}
