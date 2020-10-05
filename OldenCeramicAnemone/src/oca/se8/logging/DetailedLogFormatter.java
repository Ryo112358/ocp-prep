package oca.se8.logging;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public final class DetailedLogFormatter extends Formatter {
	
	public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

	@Override
	public String format(LogRecord record) {
		LocalDateTime recordDateTime = LocalDateTime.ofInstant(
				Instant.ofEpochMilli(record.getMillis()), 
				ZoneId.systemDefault());
		
		StringBuilder builder = new StringBuilder(256);
		
		builder.append(recordDateTime.format(dtf)).append(" - ")
	    	.append("[").append(record.getSourceClassName()).append(".")
	    	.append(record.getSourceMethodName()).append("]")
	    	.append(System.lineSeparator())
	    	.append("[").append(record.getLevel()).append("] - ")
	    	.append(formatMessage(record))
	    	.append(System.lineSeparator());
		
		return builder.toString();
	}
}
