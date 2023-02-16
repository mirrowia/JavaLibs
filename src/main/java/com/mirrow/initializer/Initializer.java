package com.mirrow.initializer;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Initializer {
	
public static Logger loggerInit (File configFile, Class<?> className) {
	
	final LoggerContext context = (LoggerContext) LogManager.getContext(false);
	
	context.setConfigLocation(configFile.toURI());
	
	Logger logger = LogManager.getLogger(className);
	
	return logger;
}

}
