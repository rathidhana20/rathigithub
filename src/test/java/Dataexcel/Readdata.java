package Dataexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {
	
	public static void particular_cell_data() throws IOException {
		File f=new File("E:\\Users\\pc-com\\eclipse-workspace\\Mc;aaven1\\new excel for read data.xlsx");
		FileInputStream fs= new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fs);
        Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(3);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING))
		{
			String cellValue = c.getStringCellValue();
		  System.out.println(cellValue);
			
		}
		
		else if (type.equals(CellType.NUMERIC))
		
		{ double cellvalue = c.getNumericCellValue();
		
		int value= (int) cellvalue;
		System.out.println(value);
			
		}
			wb.close();
		}
		
	public static void alldata() throws IOException {
		File f= new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\new excel for read data.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++)
		{
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++)
			{
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) 
				{
					String value = c.getStringCellValue();
					System.out.println(value);
					
				} 
				else if (type.equals(CellType.NUMERIC)) {
					double numericCellValue = c.getNumericCellValue();
					int v= (int) numericCellValue;     //----->narrowing casting
					String value = Integer.toString(v);
					System.out.println(value);
					
				}		
				
					
				
			
			
		
		
  wb.close();
			}}
	}
	
	public static void particular_Row_Data() throws IOException {
		File f= new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\new excel for read data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		
		Row r = s.getRow(3);
		 for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
			 Cell c = r.getCell(i);
			 CellType type = c.getCellType();
			 
			 if (type.equals(CellType.STRING)) {
				 String cellValue = c.getStringCellValue();
				 System.out.println(cellValue);
				
			}
			 else if (type.equals(CellType.NUMERIC)) {
				 double numericCellValue = c.getNumericCellValue();
				 int value=(int) numericCellValue;
				 String string = Integer.toString(value);
				 System.out.println(string);
				
			}	
		}
		  
		
		
 wb.close();
	}
	public static void particular_column_data() throws IOException {
		
			File f= new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\new excel for read data.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb= new XSSFWorkbook(fis);
			Sheet s=wb.getSheetAt(0);
			
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r=s.getRow(i);
				Cell c= r.getCell(1);
				 CellType type= c.getCellType();
			 
			  
			 
			if(type.equals(CellType.STRING))
			 {
			String cellvalue =c.getStringCellValue();
			System.out.println(cellvalue);
			}
			
			
			else if (type.equals(CellType.NUMERIC)) {
				 double numericCellValue = c.getNumericCellValue();
				 int value=(int) numericCellValue;
				 String string = Integer.toString(value);
				 System.out.println(string);
			 
				
			}}
			
	 wb.close();
		}


	public static void main(String[] args) throws IOException {
		
		particular_cell_data();
		alldata();
		particular_Row_Data();
		particular_column_data();
		
		
	}
	
	
}

