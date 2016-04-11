package org.alllog2slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonLogDemo {
	Log log = LogFactory.getLog(CommonLogDemo.class);
	public void whiteLog(){
		log.info("commons.logging");
	}
}
