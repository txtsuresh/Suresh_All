package Core_Java;

public class Overriding extends Overloading {
	
	public void getdata()
	{
		System.out.println("Overrding - Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding a = new Overriding();
		a.getdata();

	}

}
