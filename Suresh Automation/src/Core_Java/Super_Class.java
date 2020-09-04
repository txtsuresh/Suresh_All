package Core_Java;

public class Super_Class extends Super_Keyword_Parent{
	
//Super keyword - Calling a string
	
	String a= "Child -hello hello";
	public void getdata()
	{
		
		System.out.println(a);
	System.out.println(super.a);
	}
	
	

	//Super keyword - Calling a Method from parent class
public void superkeyword()
{
	super.superkeyword();
	System.out.println("I am child Class");
	}

//Super keyword - Calling a Constructor

public Super_Class()
{
	super();
	System.out.println("I am child Constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super_Class S = new Super_Class();
		S.superkeyword();
		S.getdata();
		
	
	}

}