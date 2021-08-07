package efdUtil;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogFactory {

	public static Logger getLogger(String fullPath) throws SecurityException, IOException {
		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;
		// This block configure the logger with handler and formatter
		fh = new FileHandler(fullPath);
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);
		
		return logger;

	}

}
