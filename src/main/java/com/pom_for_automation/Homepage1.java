package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement home1;

	public Homepage1(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getHome1() {
		return home1;
	}
	
	

}
