package Core_Java;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class java_basics {
	
//Method
	@Test
	public void getdata()
	{
	int a = 10;
	System.out.println(a);
	}

	public static void main(String[] args) {


// Calling a Method in Main Block		
		java_basics m1 = new java_basics();
		m1.getdata();
//		
/*		Test1 browser = new Test1();
		browser.getdata();
		
*/

//Basic Java Script for Printing in Console
		System.out.println("Test");

		
//Integer Declaration
		int a = 1;
		int b= 2;
		int ab = a+b;
		
		System.out.println(ab);
		

//For Loop
		for(int i=0;i<3;i++) 
		{
		System.out.println(i);
		}

		
		for(int i=0;i<=4;i=i+2)
		{		
		System.out.println(i);
		}
		
//If Else	
		int i1=2;
		if (i1>1)
		{
		  System.out.println("Success");
		}else
		{  System.out.println("Fail");
		}
		
		if (1>2)
		{
				System.out.println("Pass");
		}
		else
		{
		System.out.println("Fail");
				}
	
//If Else Inside For Loop
		
		for(int i=0;i<3;i++) 
		{
		if (i>1)
		{
		  System.out.println("Success");
		}else
		{  System.out.println("Fail");
		}
		}
		
		for(int i=10;i<25;i=i+7)
		{
		if (i>21)
			System.out.println ("21 is displayed");
		else
			System.out.println("Value is not displayed");
		}
		
		
// Strings
		
		String S = "Hello";
		System.out.println(S.charAt(2));
		System.out.println(S.length());
		System.out.println(S.concat(" test"));
		System.out.println(S.toUpperCase());
		
//While Loop
		
		int i2 = 7;
		while (i2>4)
			{
			System.out.println(" I2 is greater than 4");
			i2--;
			}
		
		int i = 5;
		
	while(i<7)	
		
	{
		System.out.println(" I is less than 10");
		i++;
	}
		
// Do While
	
	int i3 = 3;
	do 
	{ System.out.println("Do command executed");
	}
	  while (i3>4);
	  
	
	int j=6;
	int	k=j+2;
	do
	{
		System.out.println(k);
			} while(k<6);
	
//Nested Loop
	for (int s=0;s<3;s++)
	{System.out.println("Outer loop started");
	for (int t=1;t<3;t++)
	{ System.out.println("Inner loop started");
	} System.out.println("outer loop completed");
	}
	
	int n=1;
	for(int l=1;l<4;l++)
		
	
	{
	//	System.out.println("Out loop started");
		for(int m=0;m<4-l;m++)
		{
			System.out.print(n);
			System.out.print("\t");
		n++;
		
	}
	System.out.println("");
	

		//System.out.println("Out loop finished");
	
	}
	
		
	}

}
