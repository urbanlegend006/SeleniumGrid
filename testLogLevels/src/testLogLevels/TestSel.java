package testLogLevels;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestSel {
	
	private static final Logger log = LogManager.getLogger();
	public static void main(String[] args) {
		
		System.setProperty("log4j.configurationFile", "/testLogLevels/resources/log.xml");
		// TODO Auto-generated method stub
		log.info("I am in Info");
		log.error("I am in error ");
		log.debug("I am in debug");
		log.fatal("In fatal");
	}

}
