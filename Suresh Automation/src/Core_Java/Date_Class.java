package Core_Java;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date s= new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(s.toString());
		System.out.println(s1.format(s));
		System.out.println(s2.format(s));
	
	}
}
