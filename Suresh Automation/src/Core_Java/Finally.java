package Core_Java;

public class Finally {

	public static void main(String[] args) {
	
		int a = 5;
		int b= 0;
		
		
		
		try
		{
			int k=a/b;
		}

		
		finally
		{
			int l=b/a;
			System.out.println(l);
		}

	}

}
