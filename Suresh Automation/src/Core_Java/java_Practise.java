package Core_Java;

public class java_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//For Loop
		
		for(int i=0;i<3;i=i+1)
		{
			System.out.println(i);
			
		}
	
		
		
//If Else
		int j=1;
		if (j<0)
		{
			System.out.println("True value");
			
		} else
		{
			System.out.println("False value");
			
		}
	
//Do While
		
		int k =1;
		do 
		{
			System.out.println("Do is success");
		}while (k<0);
		
 //While
		int l =0;
		
		while(l<2)
		{
			System.out.println("while is success");
			l++;
			
		}
//Nested loop
		int n1 = 9;
		
		for(int i=1;i<4;i--)
		{
			for(int n=1;n<4;n++)
			{
				System.out.print(n1);
				System.out.print("\t");
				n1--;
			}System.out.println("");
		}
			
	}

}
