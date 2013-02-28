package com.vf.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B {
	final static Logger logger = LoggerFactory.getLogger(B.class);

	public void logB() {
		System.out.println("B: Hello world!");
		logger.debug("B: debug");
		logger.info("B: info");
		logger.warn("B: warn");
		logger.error("B: error");
	}

}
