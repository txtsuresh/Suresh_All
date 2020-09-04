package basic_logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test2 {

	 private static Logger log =LogManager.getLogger(Test2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debug error");
		log.error("Error displayed");
		log.info("Info displayed");
		log.fatal("fatal error");
	}

}
