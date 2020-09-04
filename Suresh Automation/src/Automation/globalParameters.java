package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class globalParameters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream value = new FileInputStream("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Suresh Automation\\src\\Automation\\data.properties");
		Properties data= new Properties();
		data.load(value);
		System.out.println(data.getProperty("browser"));
		System.out.println(data.getProperty("URL"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}
