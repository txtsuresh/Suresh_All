package Core_Java;

public class this_keyword {
	
	String a = "hello main";
// Execution thru constructor	
	public this_keyword()
	{
		System.out.println(this.a);
	}
// Execution thru Method	
	public void Stringdata()
	{
		String a = "hello method";
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a+" "+this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this_keyword a1= new this_keyword();
		a1.Stringdata();
		
		
		

	}

}
