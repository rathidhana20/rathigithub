package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Base_class {
	public static WebDriver driver;
	public static String value;
	
	public static WebDriver browser_configuration(String type) {
		
		try {
			if (type.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver123\\chromedriver.exe");
			     driver =new ChromeDriver();
				
			}
			else if (type.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "Value");
			     driver=new FirefoxDriver();
				
			}
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
       
	}
	 public static void geturl(String url) {
		 driver.get(url);
	 }
	 public static void scrollupanddown(WebElement element ) {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].srollIntoView();", element);
		

	}
	 public static void ClickonElement(WebElement element) {
		 element.click();
     
	}
	 public static void invalueelement(WebElement element, String data) {
		 element.sendKeys(data);
		 
       
	}
	 public static void close() {
	{
		 
		 driver.close();}
	

	}
	 
	  public static void action(WebElement element, String type) {
		  Actions a= new Actions(driver);
		  if (type.equalsIgnoreCase("moveToElement")) {
          a.moveToElement(element).build().perform();		
		}
		  else if(type.equalsIgnoreCase("click")) {
			  a.click(element).build().perform();
			
		}

	}
	  
	
		
		 
	
	 public static void screenshot(String path) throws Throwable {
		 
		 TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path);
			FileUtils.copyFile(src, des);
			
		

	}
	    public static void sleep(int seconds) throws Throwable {
	    	Thread.sleep(seconds);
			

		}
	 
	    public static void implicitwait(int seconds, TimeUnit format) {
	    	driver.manage().timeouts().implicitlyWait(seconds, format);
			
		}
	    
	   public static void dropdown(String type, String value, int index, WebElement element ) {
		   
		   Select s=new Select(element);
		    if (type.equalsIgnoreCase("byvalue")) {
		    	s.selectByValue(value);
				
			}
		    else if (type.equalsIgnoreCase("bytext")) {
		    	s.selectByVisibleText(value);
				
			}
		    else if (type.equalsIgnoreCase("byindex")) {
		    	s.selectByIndex(index);
				
			}
		    
		   
		   
		

	}
	   public static void explicit(WebElement String, int value) {
		WebDriverWait wait=new WebDriverWait(driver,value);
		wait.until(ExpectedConditions.visibilityOf(String));

	}
	   
	public static String Automation_test_data( int Row_Data,int cell_data) throws IOException {
		File f=new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\test case for automation.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(Row_Data);
		Cell cell = r.getCell(cell_data);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
			
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int v=(int) numericCellValue;
			value = String.valueOf(v);
			
		wb.close();	
			
		}
		return value;

	}
		public static String Adactin_test_data(int Row_Data,int cell_data) throws IOException {
			File f=new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\test case for adactin.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb =new XSSFWorkbook(fis);
			Sheet s = wb.getSheetAt(0);
			Row r = s.getRow(Row_Data);
			Cell cell = r.getCell(cell_data);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				value = cell.getStringCellValue();
				
			}
			
			
			
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int v=(int) numericCellValue;
				value = String.valueOf(v);
			wb.close();

		}
			return value;

	}}




	
	


