package Core_Java;

public class Constructor {
	
	String s = "test";
	
//Default Constructor
public Constructor()
{
	System.out.println("I am Constructor");
	System.out.println(s);
}

//Parameterized Constructor
public Constructor(String a, String b, String c )
{
	System.out.println(a+" "+b+" "+c);
	System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor C = new Constructor();
		Constructor C1 = new Constructor("Pass","fail","5");
		
	}

}
