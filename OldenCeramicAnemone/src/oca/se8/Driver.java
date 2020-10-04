package oca.se8;

import java.util.logging.Logger;

import oca.se8.logging.LoggerUtility;

public class Driver {
	
	private static final Logger logger = Logger.getLogger(Driver.class.getName());

	public static void main(String[] args) {
		
		LoggerUtility.configureConsoleLogger(logger);
		logger.info("testing");
		System.out.println("Hello World! ^.^");
		logger.fine("testing 2");
	}

}
