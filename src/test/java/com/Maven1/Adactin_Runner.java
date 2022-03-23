package com.Maven1;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_class;
import com.pagemanager.Pageobjectmanager_Adactin;

import pom_for_adactin.Confirm_page;
import pom_for_adactin.Continue_page;
import pom_for_adactin.Home_page;
import pom_for_adactin.Hotel_details;
import pom_for_adactin.Personal_details;



public class Adactin_Runner extends Base_class{
	public static WebDriver driver=browser_configuration("chrome");
	public static Pageobjectmanager_Adactin pom =new Pageobjectmanager_Adactin(driver);
	public static Logger log= Logger.getLogger(Adactin_Runner.class);
	public static void main(String[] args) throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
		
		
		geturl(Adactin_test_data(1, 5));
		implicitwait(20, TimeUnit.SECONDS);
		log.info("Url Successfully Launched");
		
		//homepage
		invalueelement(pom.getinstance_hp().getUser(),Adactin_test_data(2, 5));
		invalueelement(pom.getinstance_hp().getPass(), Adactin_test_data(3, 5));
		ClickonElement(pom.getinstance_hp().getLogin());
		log.info("login Credentials entered successfully");
		
		//hoteldetails
	    invalueelement(pom.getinstance_hd().getLoc(),Adactin_test_data(5, 5)) ;
		invalueelement(pom.getinstance_hd().getHotel(),Adactin_test_data(6, 5));
		invalueelement(pom.getinstance_hd().getRoomnos(),Adactin_test_data(8, 5));
	    invalueelement(pom.getinstance_hd().getDatein(), Adactin_test_data(9, 5));
		invalueelement(pom.getinstance_hd().getDateout(),Adactin_test_data(10, 5) );
		invalueelement(pom.getinstance_hd().getAdult(),Adactin_test_data(11, 5));
		invalueelement(pom.getinstance_hd().getChild(),Adactin_test_data(12, 5));
		ClickonElement(pom.getinstance_hd().getSubmit());
		log.info("Hotel details entered");
		//continuepage
		
		ClickonElement(pom.getcontinue_page_cp().getRadio());
		ClickonElement(pom.getcontinue_page_cp().getConti());
		
		//personaldetails
		
		invalueelement(pom.getpersonal_details_pd().getFirst(),Adactin_test_data(16, 5));
		invalueelement(pom.getpersonal_details_pd().getLast(), Adactin_test_data(17, 5));
		invalueelement(pom.getpersonal_details_pd().getAddress(), Adactin_test_data(18, 5));
		invalueelement(pom.getpersonal_details_pd().getCardno(), Adactin_test_data(19, 5));
		invalueelement(pom.getpersonal_details_pd().getType(),Adactin_test_data(20, 5));
		dropdown("byvalue", "7", 0, pom.getpersonal_details_pd().getExpdate());
		dropdown("byvalue", "2022", 0, pom.getpersonal_details_pd().getExpyear());
		invalueelement(pom.getpersonal_details_pd().getCvv(),Adactin_test_data(22, 5));
		ClickonElement(pom.getpersonal_details_pd().getBook());
		log.info("Hotel booking confirmed");
		//confirmpage
		
        ClickonElement(pom.getinstanceconfirm_page_cfm().getItinerary());
        screenshot("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\Screenshotmaven\\snapadac.png");
        ClickonElement(pom.getinstanceconfirm_page_cfm().getLogout());
        log.info("Logged out successfully");
	
	close();
	}
	
 
}

