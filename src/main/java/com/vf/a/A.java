package com.vf.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {
	final static Logger logger = LoggerFactory.getLogger(A.class);

	public void logA() {
		System.out.println("A: Hello world!");
		logger.debug("A: debug");
		logger.info("A: info");
		logger.warn("A: warn");
		logger.error("A: error");
	}

}
