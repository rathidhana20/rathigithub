package com.Maven1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_class;
import com.pagemanager.Pageobjectmanager_automation;
import com.pom_for_automation.Back;
import com.pom_for_automation.Bank;
import com.pom_for_automation.Confirm;
import com.pom_for_automation.Homepage1;
import com.pom_for_automation.Homepage2;
import com.pom_for_automation.Homepage3;
import com.pom_for_automation.Homepage4;
import com.pom_for_automation.Logout;
import com.pom_for_automation.Proceed1;
import com.pom_for_automation.Proceed2;
import com.pom_for_automation.Proceed3;
import com.pom_for_automation.Product1;
import com.pom_for_automation.Product2;

public class Automation_Runner extends Base_class{
	public static WebDriver driver= browser_configuration("chrome");
	public static Pageobjectmanager_automation pom= new Pageobjectmanager_automation(driver);	
	public static Logger log=Logger.getLogger(Automation_Runner.class);
	
	public static void main(String[] args) throws Throwable  {
		PropertyConfigurator.configure("log4j.properties");
		
		geturl("http://automationpractice.com/index.php");
		implicitwait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 log.info("URL Succesfully launched");
		 
		 ClickonElement(pom.getinstancehp1().getHome1());
		invalueelement( pom.getinstancehp2().getMail(), Automation_test_data(3, 5));
		invalueelement(pom.getinstancehp2().getPass(), Automation_test_data(4, 5));
		ClickonElement(pom.getinstancehp2().getSignin());
		log.info("Login credentials entered successfully");
		
		ClickonElement(pom.getinstancehp3().getHome2());
	   
	   //product1
	    ClickonElement(pom.getinstancep1().getDress1());
	    ClickonElement(pom.getinstancep1().getQuan1());
	    dropdown("byvalue","2" , 0, pom.getinstancep1().getSize1());
	    ClickonElement(pom.getinstancep1().getColor1());
	    ClickonElement(pom.getinstancep1().getCart1());
	    ClickonElement(pom.getinstancep1().getClose());
	   log.info("Dress1 purchased");	    
	   //Homepage4
	   
	   ClickonElement(pom.getinstancehp4().getHome3());
	   
	   
	   //product2
	  
	   ClickonElement(pom.getinstancep2().getDress2());
	   dropdown("byvalue", "3", 0, pom.getinstancep2().getSize2());
	   ClickonElement(pom.getinstancep2().getColor());
	   ClickonElement(pom.getinstancep2().getCart2());
	   ClickonElement(pom.getinstancep2().getProceed1());
	  log.info("Dress2 purchased");
	  //proceed1 
	   
	   ClickonElement(pom.getinstancepc1().getProceed1());
	   
	  //proceed2 
	   sleep(2000);
	  
	   invalueelement(pom.getinstancepc2().getMess(), Automation_test_data(30, 5));
	      
	   ClickonElement(pom.getinstancepc2().getProceed2());
	   
	  //proceed3
	  
	   ClickonElement(pom.getinstancepc3().getCheck());
	   ClickonElement(pom.getinstancepc3().getProceed3());
	   
	  //bank
		
	   ClickonElement(pom.getinstanceb().getBank());
		
		screenshot("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\Screenshotmaven\\snap2.png");
		
		//confirm
		
		ClickonElement(pom.getinstancec1().getConfirm());
		log.info("Order confirmed");
		
		//back
		
		ClickonElement(pom.getinstanceb1().getBack());
		
		//logout
		
		action(pom.getinstancelg().getMove(), "moveToElement");
		 screenshot("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\Screenshotmaven\\snap3.png");
		 
		ClickonElement(pom.getinstancelg().getLogout());
		log.info("Successfully logged out");
		
		close();
      
	    
	   
	   
	}}
