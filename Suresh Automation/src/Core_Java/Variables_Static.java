package Core_Java;

public class Variables_Static {

	String Degree; //Instance Variable
	String City;
	static String state = "Tamil NAdu"; //Class Variable or Static Variable
	static int k;
	static int l;
	static //Static Block
	{
		k = 0;
		l = 1;
	}
	

	public  Variables_Static(String Name, String Degree, String City) //Parametrized Constructor
	{
		int a = 5; //Local Variable
		String b= "hello"; //Local Variable
		System.out.println(Name +  " "+b);
		this.City = City;
		this.Degree = Degree;
		
		System.out.println(City);
		System.out.println(this.Degree);
		System.out.println(state);
	}
	
	public static void method() //Static Methiod will accept only static variables
	{
		System.out.println(state);
		System.out.println(k + " "+l);
	}
	
	public static void main(String[] args) {
		Variables_Static a = new Variables_Static("Suresh","Textile", "Coimbatore");
		Variables_Static a1 = new Variables_Static("Viyaan","Mech", "Toronto");
		
		Variables_Static.method(); //Calling a static method.

	}

}
