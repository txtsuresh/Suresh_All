package basic_logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

	static Logger log = LogManager.getLogger(Test1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Test1 Debug error");
		log.error("Test1 Error displayed");
		log.info("Test1 Info displayed");
		log.fatal("Test1 fatal error");

	}

}
