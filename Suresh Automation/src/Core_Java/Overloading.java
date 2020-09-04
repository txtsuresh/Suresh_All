package Core_Java;


public class Overloading {
	
	public int i =7;
	
	 public void getdata()
	{
		System.out.println("Get Data 1");
	}
	 
	
	public void getdata(int a, int b)
	{
		System.out.println(b);
	}
	
	public void getdata(String c)
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Overloading ab = new Overloading();
		ab.getdata();
		ab.getdata(5, 7);
		ab.getdata("hello");
		
	}

}
