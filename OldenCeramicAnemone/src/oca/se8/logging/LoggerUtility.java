package oca.se8.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public final class LoggerUtility {
	
	private static final PlainLogFormatter plainLogFormat = new PlainLogFormatter();
	private static final DetailedLogFormatter detailedLogFormat = new DetailedLogFormatter();
	
	private LoggerUtility() {
		throw new IllegalStateException("DNI LoggerUtility");
	}
	
	public static void configureConsoleLogger(Logger logger) {
		logger.setUseParentHandlers(false);
		final ConsoleHandler ch = new ConsoleHandler();
		ch.setFormatter(plainLogFormat);
		logger.addHandler(ch);
	}
	
	public static void configureConsoleLogger(Logger logger, boolean detailed) {
		logger.setUseParentHandlers(false);
		final ConsoleHandler ch = new ConsoleHandler();
		
		if (detailed)
			ch.setFormatter(detailedLogFormat);
		else
			ch.setFormatter(plainLogFormat);
		
		logger.addHandler(ch);
	}

}
