package org.alllog2slf4j;

import org.junit.Test;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class Main {
	@Test
	public void doMethod(){
		// TODO Auto-generated method stub
		SLF4JBridgeHandler.install(); //使用了系统自带的日志工具
		Log4jDemo log4j = new Log4jDemo();
		log4j.whiteLog();
		LoggingDemo logging = new LoggingDemo();
		logging.whiteLog();
		CommonLogDemo commonLogDemo = new CommonLogDemo();
		commonLogDemo.whiteLog();
		Slf4jDemo slf4jDemo = new Slf4jDemo();
		slf4jDemo.whiteLog();
	}

	
	

}
