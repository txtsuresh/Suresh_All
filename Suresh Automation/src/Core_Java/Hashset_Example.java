package Core_Java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Example {

	public static void main(String[] args) {
		
	HashSet<String> a = new HashSet<String>();
	
	a.add("Yaanvi");
	a.add("Suresh");
	a.add("Viyaan");
	a.add("Suresh");
	a.add("Dhanapriya");
	
	System.out.println(a);
	System.out.println(a.size());

		Iterator<String> b = a.iterator();
		
	System.out.println(b.next());
		
		while (b.hasNext())
		{
			System.out.println(b.next());
		}
		
	}

}
