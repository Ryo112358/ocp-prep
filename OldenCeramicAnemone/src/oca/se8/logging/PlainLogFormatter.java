package oca.se8.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class PlainLogFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		StringBuilder builder = new StringBuilder(128);
		builder.append(formatMessage(record)).append(System.lineSeparator());
		return builder.toString();
	}

}
