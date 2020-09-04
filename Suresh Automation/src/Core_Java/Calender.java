package Core_Java;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c= Calendar.getInstance();
		SimpleDateFormat s1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(c.getTime());
		System.out.println(s1.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
	}

}
