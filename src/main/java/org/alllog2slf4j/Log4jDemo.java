package org.alllog2slf4j;

import org.apache.log4j.Logger;

public class Log4jDemo {
	Logger log = Logger.getLogger(getClass());
	public void whiteLog(){
		log.info("log4j info");
		log.debug("log4j debug");
		log.warn("log4j warn");
		log.error("log4j error");
	}
}
