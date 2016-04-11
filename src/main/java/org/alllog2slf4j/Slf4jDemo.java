package org.alllog2slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {
	Logger log = LoggerFactory.getLogger(Slf4jDemo.class);
	public void whiteLog(){
		log.info("slf4j info");
		log.debug("slf4j debug");
		log.warn("slf4j warn");
		log.error("slf4j error");
	}
}
