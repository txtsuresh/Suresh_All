package Maven.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
	public  ArrayList getdata(String string) throws IOException
	{
		ArrayList avalue = new ArrayList();
		
//Pull the excel datasheet into Eclipse code		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Suresh Kumar\\Desktop\\Automation_Datadriven.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(fs);
//Get the Excel tab count and fetch the required sheet tab name		
	int sheetcount =excel.getNumberOfSheets();
	
	for(int i=0;i<sheetcount;i++)
	{
		String sheetnames = excel.getSheetName(i);
		//System.out.println(sheetnames);
		if(sheetnames.equalsIgnoreCase("Login"))
		{
		XSSFSheet sheetname = excel.getSheetAt(i);
		
//Navigate thru the excel table row#1 and get the required columnn# 
		Iterator<Row> rows = sheetname.iterator();
		Row firstrow= rows.next();
			
		 Iterator<Cell> column =firstrow.cellIterator();
		 int a=0;
		 int columncount = 0;
		while (column.hasNext())
			{
			Cell columnvalue= column.next();
			if(columnvalue.getStringCellValue().equalsIgnoreCase("Password"))
			{
				
				columncount = a;
		//		System.out.println("sucess");
								
			}
			a++;
			
			}
		//System.out.println(columncount);
//Navigat thru the column & identify the row match value..
			while(rows.hasNext())
			{
				Row rowvalue=rows.next();
				
				if(rowvalue.getCell(columncount).getStringCellValue().equalsIgnoreCase("SFpassword"))
						{
			//		System.out.println("sucess SF");
//Add all values from the identified row to the array list
					
					Iterator<Cell> finaldata = rowvalue.cellIterator();
					while(finaldata.hasNext())
					{
						avalue.add(finaldata.next().getStringCellValue());						
						System.out.println(avalue);
					}
						}
			
			}
				}	
			
		}
		return avalue;
	
		
	}	

	public static void main(String[] args) throws IOException  {
		ExcelDataDriven d = new ExcelDataDriven();
		ArrayList data = d.getdata(null);
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));		
	
		

	}
}