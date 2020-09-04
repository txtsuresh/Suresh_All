package basic_logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_logs {
	

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(Practise_logs.class.getName());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		log.debug("Chrome is launched");
		driver.get("https://www.google.ca/");
		log.info("Google is displayed");
		
	
	       

	}

}
