package Core_Java;
import java.util.ArrayList;

public class ArrayListclass {

	public static void main(String[] args) {
				
		ArrayList<String> a = new ArrayList<String> ();
			
		a.add("Suresh");
		a.add("Viyaan");
		a.add("Yaanvi");
		a.add(0, "Yaanvi");
			
		System.out.println(a.get(0));
		System.out.println(a);
		System.out.println(a.contains("Viyaan"));
		System.out.println(a.indexOf("Suresh"));
		System.out.println(a.size());
		
	}

}
