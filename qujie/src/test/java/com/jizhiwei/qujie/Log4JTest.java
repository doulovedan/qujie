package com.jizhiwei.qujie;

import org.apache.log4j.Logger;

public class Log4JTest {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4JTest.class);
		logger.fatal("我是 fatal()");
		logger.error("我是 error()");
		logger.warn("我是 warn()");
		logger.info("我是 info()");
		logger.debug("我是 debug()");
		logger.trace("我是 trace()");
	}
}
