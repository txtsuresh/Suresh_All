package Maven.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Realtime_ExcelDriven {
	
	public ArrayList getdata(String string) throws IOException
	{
		ArrayList Svalue = new ArrayList();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Suresh Kumar\\Desktop\\Automation_Datadriven.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
	int sheetscount= excel.getNumberOfSheets();
	
		for (int i=0;i<sheetscount;i++)
		{
			String sheetname = excel.getSheetName(i);
			 System.out.println(sheetname);
			if(sheetname.equalsIgnoreCase("Login"))
			{
			XSSFSheet tab = excel.getSheetAt(i);
			
			java.util.Iterator<Row> Rows = tab.iterator();
			Row firstrow = Rows.next();
			
			java.util.Iterator<Cell> column = firstrow.cellIterator();
			int a=0;
			int columncount = 0;
			
			
			while (column.hasNext())
			{
				Cell columnvalue = column.next();
				
				if(columnvalue.getStringCellValue().equalsIgnoreCase("Password"))
				{
				 columncount = a;
				 System.out.println(columncount);
				}
				a++;
			}
					while(Rows.hasNext())
					{
						Row rowvalue = Rows.next();
						if(rowvalue.getCell(columncount).getStringCellValue().equalsIgnoreCase("propassword"))
						{
							Iterator<Cell> selectrow = rowvalue.cellIterator();
							while(selectrow.hasNext())
							{
												
								Svalue.add(selectrow.next().getStringCellValue());
							System.out.println(Svalue);
						
							}
							
							
						}
						
					}
				}
			
			
			
			
			} 
			
			
			return Svalue;
			
		}
		
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Realtime_ExcelDriven test = new Realtime_ExcelDriven();
		test.getdata(null);
		ArrayList data = test.getdata(null);
		System.out.println(data.get(0));
//		System.out.println(data.get(1));
	
		
	}

}
