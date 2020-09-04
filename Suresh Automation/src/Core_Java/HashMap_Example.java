package Core_Java;

import java.util.HashMap;

public class HashMap_Example {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "Suresh");
		a.put(3, "Suresh");
		a.put(4, "Yaanvi");
		a.put(0, "Viyaan");
		a.put(7, null );
		
		System.out.println(a);
		System.out.println(a.get(4));
		System.out.println(a.containsValue("Suresh"));
		
		
		
	}

}
