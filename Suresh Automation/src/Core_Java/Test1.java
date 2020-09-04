package Core_Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public void getdata()
	
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.ca/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.ca/");
	

	}
	

}


