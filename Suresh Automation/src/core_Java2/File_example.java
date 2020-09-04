package core_Java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File a = new File("filename.txt");
//create a file		
		try {
			a.createNewFile();
			System.out.println("file created"+" " + a);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured");
			e.printStackTrace();
		}
//write a file
		 
		try {
			FileWriter	b = new FileWriter("filename.txt");
			b.write("File write success");
			b.close();
			System.out.println("Sucessfully written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Write error occured");
			e.printStackTrace();
		}
		
		
		
//Read a file;
		
		try {
			Scanner	c = new Scanner (a);
			String data = c.nextLine();
			
			System.out.println(data);
			
			c.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//delete a file		
		a.delete();
		System.out.println("Deleted file is"+ "  " + a.getName());
		
	
		}
	

}
